import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ListaEmprendimientosComponent } from './lista-emprendimientos/lista-emprendimientos.component';




@NgModule({
  declarations: [
    AppComponent,
    ListaEmprendimientosComponent,

  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
