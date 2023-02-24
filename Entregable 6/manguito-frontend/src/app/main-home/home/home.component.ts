import { Component } from '@angular/core';
import { AuthService } from '../../Service/auth.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  public isAuthenticated: boolean;

  constructor(private authService: AuthService){}


  ngOnInit() {
    this.isAuthenticated = this.authService.isAuthenticated();
  }

}
