import { Component, OnInit } from '@angular/core';
import { ManguitoService } from '../../Service/manguito.service';
import { Emprendimiento } from '../../Model/emprendimiento';

@Component({
  selector: 'app-lista-emprendimientos',
  templateUrl: './lista-emprendimientos.component.html',
  styleUrls: ['./lista-emprendimientos.component.css']
})
export class ListaEmprendimientosComponent implements OnInit{

  emprendimientos:Emprendimiento[];

  constructor(private manguitoService : ManguitoService){}

  ngOnInit(): void {
    this.obtenerEmprendimientos();
  }

  private obtenerEmprendimientos(){
    this.manguitoService.obtenerEmprendimientos().subscribe(dato => {
      this.emprendimientos = dato;
    });
  }

}
