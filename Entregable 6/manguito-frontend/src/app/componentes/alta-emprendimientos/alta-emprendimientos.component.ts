import { Component } from '@angular/core';
import { EmprendimientoRegistro } from '../../Model/emprendimientoRegistro';
import { Router } from '@angular/router';
import { ManguitoService } from 'src/app/Service/manguito.service';
import { Emprendimiento } from '../../Model/emprendimiento';
import { AuthService } from '../../Service/auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-alta-emprendimientos',
  templateUrl: './alta-emprendimientos.component.html',
  styleUrls: ['./alta-emprendimientos.component.css']
  
})
export class AltaEmprendimientosComponent {

  public isAuthenticated: boolean;

  emprendimientoAlta: Emprendimiento = new Emprendimiento();

  emprendimiento: EmprendimientoRegistro = new EmprendimientoRegistro();

  usuarioId: number;

  constructor(public authService: AuthService, private router:Router, private emprendimientoServicio: ManguitoService){}

  ngOnInit() {
    this.isAuthenticated = this.authService.isAuthenticated();
    this.usuarioId = (Number(this.authService.obtenerId()));
  }

  onSubmit(form: NgForm){
    this.emprendimiento.dominio = form.value.dominio;
    this.emprendimiento.usuario_id= this.usuarioId;
    console.log(this.authService.obtenerId());
    this.emprendimientoServicio.registrarEmprendimiento(this.emprendimiento).subscribe((data) => {
      this.router.navigate(["home"]);
      alert('Emprendimiento creado con exito');
    },);
  }

  


}
