import { Component, OnInit } from '@angular/core';
import { ManguitoService } from 'src/app/Service/manguito.service';
import { Usuario } from '../../Model/usuario';
import { Router } from '@angular/router';

@Component({
  selector: 'app-alta-emprendedores',
  templateUrl: './alta-emprendedores.component.html',
  styleUrls: ['./alta-emprendedores.component.css']
})
export class AltaEmprendedoresComponent implements OnInit{

  emprendedor: Usuario = new Usuario();

  constructor(private emprendimientoServicio: ManguitoService, private router:Router){}

  ngOnInit():void{}

  guardarEmprendimiento(){
    this.emprendimientoServicio.registrarEmprendedor(this.emprendedor).subscribe(dato =>{
      this.irAHome();
    }, error => console.log(error));
  }

  irAHome(){
    this.router.navigate(['/home']);
  }

  onSubmit(){
    this.guardarEmprendimiento();
  }

}
