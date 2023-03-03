import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Categoria } from '../../Model/categoria';
import { ManguitoService } from '../../Service/manguito.service';
import { Router, } from '@angular/router';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';
import { AuthService } from '../../Service/auth.service';
import { Usuario } from '../../Model/usuario';

@Component({
  selector: 'app-editar-datos-categoria',
  templateUrl: './editar-datos-categoria.component.html',
  styleUrls: ['./editar-datos-categoria.component.css'],
})
export class EditarDatosCategoriaComponent{
  categoria: Categoria = new Categoria;
  idCategoria:any;
  respuesta: Categoria = new Categoria();

  constructor(
    private categoriaService: ManguitoService,
    private route: ActivatedRoute,
    private router: Router,
    public authService: AuthService
  ) { }

  ngOnInit(){
    this.route.paramMap.subscribe(params =>{this.idCategoria = params.get('id')});
    this.categoriaService.getCategoria(this.idCategoria).subscribe(
      data =>{
        this.respuesta = data;
        if (this.respuesta.id != null ) {
          this.categoria = data;}})
  }

  onSubmit(form: NgForm){
    this.categoria.nombre = form.value.nombre;
    this.categoria.descripcion = form.value.descripcion;
    console.log("Categoria"+this.categoria.descripcion)
    this.categoriaService.actualizarCategoria(this.categoria).subscribe(
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