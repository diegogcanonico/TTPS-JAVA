import { Component } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { Categoria } from '../Model/categoria';
import { ManguitoService } from 'src/app/Service/manguito.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-alta-categoria',
  templateUrl: './alta-categoria.component.html',
  styleUrls: ['./alta-categoria.component.css']
})
export class AltaCategoriaComponent {

  categoria: Categoria = new Categoria();


  constructor(private formBuilder: FormBuilder, private router:Router, private servicio: ManguitoService){}

  agregarCategoria(form: NgForm){
    this.categoria.descripcion = form.value.descripcion;
    this.categoria.nombre = form.value.nombre;
    console.log(this.categoria.descripcion)
    console.log(this.categoria.nombre)
    this.servicio.registrarCategoria(this.categoria).subscribe(
      data => { 
        console.log(data);
        this.router.navigate(["editarCategoria"]);
        alert('Categoria creada con exito') 
      }, err=>{alert('ELa categoría ya se encuentra registrada')})
  }


  

}
