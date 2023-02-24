import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Emprendimiento } from '../Model/emprendimiento';
import { Observable } from 'rxjs';
import { Usuario } from '../Model/usuario';
import { EmprendimientoRegistro } from '../Model/emprendimientoRegistro';
import { Categoria } from '../Model/categoria';

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

  registrarEmprendimiento(emprendimiento: EmprendimientoRegistro): Observable<Object>{
    return this.httpClient.post(`${this.baseURL + "/emprendimientos/"}`, emprendimiento)
  }

  registrarCategoria(categoria: Categoria): Observable<any>{
    return this.httpClient.post(`${this.baseURL + "/categorias/"}`, categoria)
  }

  getListaCategorias(){
    return this.httpClient.get<Categoria[]>(`${this.baseURL + "/categorias/"}`);
  }

  eliminarCategoria(id: number){
    console.log(id)
    return this.httpClient.delete<Categoria[]>(`${this.baseURL + "/categorias/"+id}`);
  }
  


}
