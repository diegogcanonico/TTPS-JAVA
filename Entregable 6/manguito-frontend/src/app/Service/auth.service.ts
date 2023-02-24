import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UsuarioLogin } from '../Model/usuarioLogin';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Usuario } from '../Model/usuario';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private baseURL = "http://localhost:8080";

  private loggedIn = false;

  constructor(private httpClient: HttpClient, private router: Router) { }

  login(usuario: any ): Observable<any>{
    return this.httpClient.post(`${this.baseURL + "/usuarios/login"}`, usuario);
  }

  logout(): void {
    this.loggedIn = false;
  }

  isAuthenticated(): boolean {
    return this.loggedIn;
  }

  setLoggedIn(value: boolean) {
    this.loggedIn = value;
  }


}
