import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Emprendimiento } from '../Model/emprendimiento';
import { Observable } from 'rxjs';
import { Usuario } from '../Model/usuario';
import { Rol } from '../Model/rol';

@Injectable({
  providedIn: 'root'
})
export class ManguitoService {

  private baseURL = "http://localhost:8080";

  constructor(private httpClient : HttpClient) { }

  

  obtenerEmprendimientos() : Observable<Emprendimiento[]>{

    return this.httpClient.get<Emprendimiento[]>(`${this.baseURL + "/emprendimientos/"}`);

  }

  registrarEmprendedor(emprendedor: Usuario): Observable<Object>{
    return this.httpClient.post(`${this.baseURL + "/usuarios/"}`, emprendedor)
  }

  
}
