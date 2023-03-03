import { Component } from '@angular/core';
import { AuthService } from '../../Service/auth.service';

@Component({
  selector: 'app-vista-administrador',
  templateUrl: './vista-administrador.component.html',
  styleUrls: ['./vista-administrador.component.css']
})
export class VistaAdministradorComponent {
  constructor(public authService: AuthService) { }

}
