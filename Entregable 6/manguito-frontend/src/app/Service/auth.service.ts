import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UsuarioLogin } from '../Model/usuarioLogin';
import { HttpClient, HttpParams } from '@angular/common/http';
import { tap } from 'rxjs/operators';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private baseURL = "http://localhost:8080";

  private loggedIn = false;

  constructor(private httpClient: HttpClient, private router: Router) { }

  login(usuario: any): Observable<any>{
    return this.httpClient.post(`${this.baseURL + "/usuarios/login"}`, usuario).pipe(
      tap(() => {
        this.setLoggedIn(true);
      })
    );
  }

  setLoggedIn(value: boolean): void {
    this.loggedIn = value;
  }

  logout(): void {
    window.localStorage.clear();
    this.setLoggedIn(false);
    this.router.navigate([""]);
  }

  isAuthenticated(): boolean {
    return this.loggedIn;
  }

  public obtenerUsername() {
    return window.localStorage.getItem("username")
  }

  public obtenerRol() {
    return window.localStorage.getItem("rol")
  }

  public obtenerId() {
    return window.localStorage.getItem("id")
  }

}
