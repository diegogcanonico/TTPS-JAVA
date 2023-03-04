import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Emprendimiento } from '../Model/emprendimiento';
import { Observable } from 'rxjs';
import { Usuario } from '../Model/usuario';
import { Posteo } from '../Model/posteo';
import { EmprendimientoRegistro } from '../Model/emprendimientoRegistro';
import { Categoria } from '../Model/categoria';

@Injectable({
  providedIn: 'root'
})
export class ManguitoService {

  private baseURL = "http://localhost:8080";

  constructor(private httpClient: HttpClient) { }



  obtenerEmprendimientos(): Observable<Emprendimiento[]> {
    return this.httpClient.get<Emprendimiento[]>(`${this.baseURL + "/emprendimientos/"}`);
  }

  getEmprendimiento(id: any) {
    const url = `${this.baseURL+ "/emprendimientos/emprendimiento/" +id}`;
    return this.httpClient.get<Emprendimiento>(url);
  }

  registrarEmprendedor(emprendedor: any): Observable<any> {
    return this.httpClient.post(`${this.baseURL + "/usuarios/"}`, emprendedor)
  }

  registrarEmprendimiento(emprendimiento: any): Observable<any> {
    return this.httpClient.post(`${this.baseURL + "/emprendimientos/"}`, emprendimiento)
  }

  registrarCategoria(categoria: Categoria): Observable<any> {
    return this.httpClient.post(`${this.baseURL + "/categorias/"}`, categoria)
  }

  getListaCategorias() {
    return this.httpClient.get<Categoria[]>(`${this.baseURL + "/categorias/"}`);
  }

  eliminarCategoria(id: number) {
    return this.httpClient.delete<Categoria[]>(`${this.baseURL + "/categorias/" + id}`);
  }

  actualizarCategoria(categoria: any): Observable<any> {
    return this.httpClient.put(`${this.baseURL + "/categorias/actualizar"}`, categoria);
  }

  getCategoria(id: any){
    return this.httpClient.get<Categoria>(`${this.baseURL+ "/categorias/obtener/" + id}`);
  }

 
  actualizarUsuario(usuario: any): Observable<any> {
    return this.httpClient.put(`${this.baseURL + "/usuarios/actualizar"}`, usuario);
  }

  getPosteos(id:any): Observable<Posteo[]> {
    return this.httpClient.get<Posteo[]>(`${this.baseURL + "/posteos/" + id}`);
  }


}
