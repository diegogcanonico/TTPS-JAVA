import { Component } from '@angular/core';
import { AuthService } from '../../Service/auth.service';

@Component({
  selector: 'app-cerrar-sesion',
  templateUrl: './cerrar-sesion.component.html',
  styleUrls: ['./cerrar-sesion.component.css']
})
export class CerrarSesionComponent {
  constructor(public authService: AuthService){}

}
