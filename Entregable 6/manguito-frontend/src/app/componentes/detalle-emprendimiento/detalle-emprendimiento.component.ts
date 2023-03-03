import { Component, OnInit } from '@angular/core';
import { ManguitoService } from '../../Service/manguito.service';
import { Emprendimiento } from '../../Model/emprendimiento';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-detalle-emprendimiento',
  templateUrl: './detalle-emprendimiento.component.html',
  styleUrls: ['./detalle-emprendimiento.component.css']
})
export class DetalleEmprendimientoComponent implements OnInit{
  emprendimiento: Emprendimiento = new Emprendimiento();
  respuesta: Emprendimiento = new Emprendimiento();

  constructor(private route: ActivatedRoute, private router: Router, private emprendimientoService: ManguitoService) { }

  ngOnInit() {
    const id = this.route.snapshot.params['id'];
    this.emprendimientoService.getEmprendimiento(id).subscribe(
      data =>{
        this.respuesta = data;
        if (this.respuesta.id != null ) {
          this.emprendimiento = data;}})
  }

 

}
