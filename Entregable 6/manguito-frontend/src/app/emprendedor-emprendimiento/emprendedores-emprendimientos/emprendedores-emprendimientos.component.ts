import { Component } from '@angular/core';
import { AuthService } from '../../Service/auth.service';

@Component({
  selector: 'app-emprendedores-emprendimientos',
  templateUrl: './emprendedores-emprendimientos.component.html',
  styleUrls: ['./emprendedores-emprendimientos.component.css']
})
export class EmprendedoresEmprendimientosComponent {

  public isAuthenticated: boolean;

  constructor(private authService: AuthService){}

  ngOnInit() {
    this.isAuthenticated = this.authService.isAuthenticated();
  }

}
