import { Component, OnInit } from '@angular/core';
import { ManguitoService } from '../../Service/manguito.service';
import { Emprendimiento } from '../../Model/emprendimiento';
import { Categoria } from '../../Model/categoria';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-emprendimientos',
  templateUrl: './lista-emprendimientos.component.html',
  styleUrls: ['./lista-emprendimientos.component.css']
})
export class ListaEmprendimientosComponent implements OnInit{

  emprendimientos:Emprendimiento[];

  constructor(private manguitoService : ManguitoService, private router: Router){}

  ngOnInit(): void {
    this.obtenerEmprendimientos();
  }

  private obtenerEmprendimientos(){
    this.manguitoService.obtenerEmprendimientos().subscribe(dato => {
      this.emprendimientos = dato;
    });
  }

}
