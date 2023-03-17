import { Component } from '@angular/core';
import { ManguitoService } from '../../Service/manguito.service';
import { NgForm } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Router, } from '@angular/router';
import { Donacion } from '../../Model/donacion';
import { AuthService } from '../../Service/auth.service';
import { Emprendimiento } from 'src/app/Model/emprendimiento';


@Component({
  selector: 'app-donacion',
  templateUrl: './donacion.component.html',
  styleUrls: ['./donacion.component.css']
})
export class DonacionComponent {

  donacion: Donacion = new Donacion;
  respuesta: Donacion = new Donacion();
  emp: Emprendimiento = new Emprendimiento();


  constructor(
    private service: ManguitoService,
    private route: ActivatedRoute,
    private router: Router,
    public authService: AuthService
  ) { }

  onSubmit(form: NgForm){
    this.donacion.emprendimiento.id = this.route.snapshot.params['id'];
    this.donacion.cantidadManguitos = form.value.cantidadManguitos;
    this.donacion.nombreDonador = form.value.nombreDonador;
    this.donacion.mensaje = form.value.mensaje;
    this.donacion.fecha = new Date;
    this.service.realizarDonacion(this.donacion).subscribe(
      data => {
      this.respuesta = data;
      console.log("Respuesta"+this.respuesta)
      if (this.respuesta != null ) {
        alert('La donacion fue actualizada con exito')
        this.router.navigate(["donacion"]);
      }
      else {
        this.router.navigate(["home"]);
      }   
    },
    err =>alert('Los datos ingresados no son validos'))
   
  }


}
