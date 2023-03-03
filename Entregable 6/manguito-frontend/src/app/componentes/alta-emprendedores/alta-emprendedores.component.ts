import { Component, OnInit } from '@angular/core';
import { ManguitoService } from 'src/app/Service/manguito.service';
import { Usuario } from '../../Model/usuario';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthService } from '../../Service/auth.service';

@Component({
  selector: 'app-alta-emprendedores',
  templateUrl: './alta-emprendedores.component.html',
  styleUrls: ['./alta-emprendedores.component.css']
})
export class AltaEmprendedoresComponent{

  emprendedor: Usuario = new Usuario();
  respuesta: Usuario = new Usuario();
  public isAuthenticated: boolean;


  constructor(public authService: AuthService, private router:Router, private servicio: ManguitoService){ }

  ngOnInit(){
    this.isAuthenticated = this.authService.isAuthenticated();
  }

  onSubmit(form: NgForm){
    this.emprendedor.nombre = form.value.nombre;
    this.emprendedor.apellido = form.value.apellido;
    this.emprendedor.username = form.value.username;
    this.emprendedor.password = form.value.password;
    this.servicio.registrarEmprendedor(this.emprendedor).subscribe(
      data => {
      this.respuesta = data;
      if (this.respuesta != null) {
        alert('Emprendedor creado con exito');
        form.reset();
    }
    else
      if (this.respuesta == null) {
        alert('Emprendedor no creado');
    }
  },
    err =>alert('Los datos ingresados no son validos'))
  }

}
