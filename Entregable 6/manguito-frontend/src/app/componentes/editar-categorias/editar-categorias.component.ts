import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import {Router} from '@angular/router';
import { AuthService } from '../../Service/auth.service';
import { ManguitoService } from 'src/app/Service/manguito.service';
import { Categoria } from '../../Model/categoria';
import { ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-editar-categorias',
  templateUrl: './editar-categorias.component.html',
  styleUrls: ['./editar-categorias.component.css'],
})
export class EditarCategoriasComponent implements OnInit{

  form: FormGroup;



  listaDeCategorias: Categoria[]

  respuesta: Categoria = new Categoria();

  categoria: Categoria = new Categoria();

  constructor(private cdr: ChangeDetectorRef, public authService: AuthService, private router:Router, private servicio: ManguitoService, private formBuilder: FormBuilder){
    this.cdr.markForCheck();
  }
    
  ngOnInit(): void {
    this.obtenerCategorias();
    this.cdr.detectChanges();
  }


  obtenerCategorias(){
    this.servicio.getListaCategorias().subscribe(dato => {
      this.listaDeCategorias = dato;
      console.log(this.listaDeCategorias);
    }, )
  }

  eliminarCategoria(id:number){
    this.servicio.eliminarCategoria(id).subscribe(dato => {
      this.obtenerCategorias();
      this.cdr.detectChanges();
      alert('Categoría eliminada con exito');
    }, )
  }

}
