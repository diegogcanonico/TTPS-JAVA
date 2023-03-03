import { Component } from '@angular/core';
import { AuthService } from '../../Service/auth.service';

@Component({
  selector: 'app-vista-emprendedor',
  templateUrl: './vista-emprendedor.component.html',
  styleUrls: ['./vista-emprendedor.component.css']
})
export class VistaEmprendedorComponent {
  constructor(public authService: AuthService){}

}
