import { Component, OnInit } from '@angular/core';
import { ManguitoService } from 'src/app/Service/manguito.service';
import { Usuario } from '../../Model/usuario';
import { Router } from '@angular/router';

@Component({
  selector: 'app-alta-emprendedores',
  templateUrl: './alta-emprendedores.component.html',
  styleUrls: ['./alta-emprendedores.component.css']
})
export class AltaEmprendedoresComponent implements OnInit{

  emprendedor: Usuario = new Usuario();

  constructor(private router:Router, private emprendimientoServicio: ManguitoService){}

  ngOnInit():void{}

  private guardarEmprendimiento(){
    this.emprendimientoServicio.registrarEmprendedor(this.emprendedor).subscribe((data) => {
      this.router.navigate(["home"]);
      alert('Emprendedor creado con exito');
    },);
  }

  irAHome(){
    this.router.navigate(["/home"]);
  }

  onSubmit(){
    this.guardarEmprendimiento();
  }

}
