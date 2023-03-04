import { Component, OnInit } from '@angular/core';
import { ManguitoService } from '../../Service/manguito.service';
import { Posteo } from '../../Model/posteo';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-posteos',
  templateUrl: './posteos.component.html',
  styleUrls: ['./posteos.component.css']
})



export class PosteosComponent implements OnInit{

  posteos: Posteo [];
  respuesta: Posteo [];

  constructor(private route: ActivatedRoute, private router: Router, private emprendimientoService: ManguitoService) { }

  ngOnInit() {
    const id = this.route.snapshot.params['id'];
    this.emprendimientoService.getPosteos(id).subscribe(
      data =>{
        this.respuesta = data;
        console.log(this.respuesta)
        if (this.respuesta != null ) {
          this.posteos = data;}})
  }


}
