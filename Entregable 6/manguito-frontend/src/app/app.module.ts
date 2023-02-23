import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { ListaEmprendimientosComponent } from './emprendedor-emprendimiento/lista-emprendimientos/lista-emprendimientos.component';
import { HomeComponent } from './main-home/home/home.component';
import { RouterModule } from '@angular/router';
import { MenuComponent } from './main-home/menu/menu.component';
import { AltaEmprendedoresComponent } from './emprendedor-emprendimiento/alta-emprendedores/alta-emprendedores.component';
import { EmprendedoresEmprendimientosComponent } from './emprendedor-emprendimiento/emprendedores-emprendimientos/emprendedores-emprendimientos.component';
import { FormsModule } from '@angular/forms';





@NgModule({
  declarations: [
    AppComponent,
    ListaEmprendimientosComponent,
    HomeComponent,
    MenuComponent,
    AltaEmprendedoresComponent,
    EmprendedoresEmprendimientosComponent,
   

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
