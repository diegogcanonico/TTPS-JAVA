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
import { AltaEmprendimientosComponent } from './emprendedor-emprendimiento/alta-emprendimientos/alta-emprendimientos.component';
import { LoginComponent } from './login/login.component';
import { VistaAdministradorComponent } from './vista-administrador/vista-administrador.component';
import { VistaEmprendedorComponent } from './vista-emprendedor/vista-emprendedor.component';
import { EditarUsuarioComponent } from './editar-usuario/editar-usuario.component';
import { EditarCategoriasComponent } from './editar-categorias/editar-categorias.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AltaCategoriaComponent } from './alta-categoria/alta-categoria.component';






@NgModule({
  declarations: [
    AppComponent,
    ListaEmprendimientosComponent,
    HomeComponent,
    MenuComponent,
    AltaEmprendedoresComponent,
    EmprendedoresEmprendimientosComponent,
    AltaEmprendimientosComponent,
    LoginComponent,
    VistaAdministradorComponent,
    VistaEmprendedorComponent,
    EditarUsuarioComponent,
    EditarCategoriasComponent,
    AltaCategoriaComponent,
  
   

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
