import { Component } from '@angular/core';
import { EmprendimientoRegistro } from '../../Model/emprendimientoRegistro';
import { Router } from '@angular/router';
import { ManguitoService } from 'src/app/Service/manguito.service';
import { AuthService } from '../../Service/auth.service';

@Component({
  selector: 'app-alta-emprendimientos',
  templateUrl: './alta-emprendimientos.component.html',
  styleUrls: ['./alta-emprendimientos.component.css']
  
})
export class AltaEmprendimientosComponent {

  public isAuthenticated: boolean;

  emprendimiento: EmprendimientoRegistro = new EmprendimientoRegistro();

  constructor(private authService: AuthService, private router:Router, private emprendimientoServicio: ManguitoService){}

  ngOnInit() {
    this.isAuthenticated = this.authService.isAuthenticated();
  }

  private guardarEmprendimiento(){
    this.emprendimientoServicio.registrarEmprendimiento(this.emprendimiento).subscribe((data) => {
      this.router.navigate(["home"]);
      alert('Emprendimiento creado con exito');
    },);
  }

  
  onSubmit(){
    this.guardarEmprendimiento();
  }

}
