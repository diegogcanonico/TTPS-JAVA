import { Component } from '@angular/core';
import { AuthService } from '../../Service/auth.service';
import { Usuario } from '../../Model/usuario';
import { ActivatedRoute } from '@angular/router';
import { Router, } from '@angular/router';
import { ManguitoService } from '../../Service/manguito.service';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-editar-usuario',
  templateUrl: './editar-usuario.component.html',
  styleUrls: ['./editar-usuario.component.css']
})
export class EditarUsuarioComponent {
  usuario: Usuario = new Usuario;
  respuesta: Usuario = new Usuario();

  constructor(
    private service: ManguitoService,
    private route: ActivatedRoute,
    private router: Router,
    public authService: AuthService
  ) { }

  ngOnInit(){
    
  }

  onSubmit(form: NgForm){
    this.usuario.id = Number(this.authService.obtenerId());
    this.usuario.nombre = form.value.nombre;
    this.usuario.apellido = form.value.apellido;
    this.usuario.password = form.value.password;
    this.usuario.username = form.value.username;
    this.usuario.rol.id = 3;
    this.service.actualizarUsuario(this.usuario).subscribe(
      data => {
      this.respuesta = data;
      console.log("Respuesta"+this.respuesta)
      if (this.respuesta != null ) {
        alert('La categoria fue actualizada con exito')
        this.router.navigate(["editarCategoria"]);
      }
      else {
        this.router.navigate(["vistaEmprendedor"]);
      }   
    },
    err =>alert('Los datos ingresados no son validos'))
   
  }


  

}
