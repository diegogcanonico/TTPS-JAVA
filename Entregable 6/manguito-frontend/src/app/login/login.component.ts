import { Component } from '@angular/core';
import { AuthService } from '../Service/auth.service';
import { Router } from '@angular/router';
import { UsuarioLogin } from '../Model/usuarioLogin';
import { catchError, tap } from 'rxjs/operators';
import { of } from 'rxjs';
import { NgForm } from '@angular/forms';
import { Usuario } from '../Model/usuario';

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
        console.log(data)
        this.respuesta = data;
        if (this.respuesta.rol.id == 1) {
          this.router.navigate(["vistaAdministrador"]);
        }
        else
          if (this.respuesta.rol.id == 2) {
          this.router.navigate(["vistaEmprendedor"]);
        }   
      },
      err =>alert('Los datos ingresados no son validos'))
    
      }


}