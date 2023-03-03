import { Component } from '@angular/core';
import { AuthService } from '../../Service/auth.service';
import { Router } from '@angular/router';
import { UsuarioLogin } from '../../Model/usuarioLogin';
import { catchError, tap } from 'rxjs/operators';
import { of } from 'rxjs';
import { NgForm } from '@angular/forms';
import { Usuario } from '../../Model/usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  
  usuario: UsuarioLogin = new UsuarioLogin();
  respuesta: Usuario = new Usuario();
  public isAuthenticated: boolean;
  public username: string;
  public password: string;
  errorMessage: string;


  constructor(private authService: AuthService, private router: Router) { }


  ngOnInit() {
    this.isAuthenticated = this.authService.isAuthenticated();
  }

  onSubmit(form: NgForm) {
    this.usuario.username = form.value.username;
    this.usuario.password = form.value.password;
    this.authService.login(this.usuario).subscribe(
      data => {
        this.respuesta = data;
        window.localStorage.setItem("username", data.username);
        window.localStorage.setItem("rol", data.rol.id);
        window.localStorage.setItem("id", data.id);
        if (this.respuesta.rol.id == 1) {
          alert('Se ha logueado como administrador');
          this.router.navigate(["vistaAdministrador"]);
        }
        else
          if (this.respuesta.rol.id == 2) {
            alert('Se ha logueado como donador');
            this.router.navigate(["vistaDonador"]);
        }   
        else
          if (this.respuesta.rol.id == 3) {
            alert('Se ha logueado como emprendedor');
            this.router.navigate(["vistaEmprendedor"]);
        }  
      },
      err =>alert('Los datos ingresados no son validos'))
    
      }


}