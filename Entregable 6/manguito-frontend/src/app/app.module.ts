import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { ListaEmprendimientosComponent } from './componentes/lista-emprendimientos/lista-emprendimientos.component';
import { HomeComponent } from './componentes/home/home.component';
import { RouterModule } from '@angular/router';
import { MenuComponent } from './componentes/menu/menu.component';
import { AltaEmprendedoresComponent } from './componentes/alta-emprendedores/alta-emprendedores.component';
import { EmprendedoresEmprendimientosComponent } from './componentes/emprendedores-emprendimientos/emprendedores-emprendimientos.component';
import { FormsModule } from '@angular/forms';
import { AltaEmprendimientosComponent } from './componentes/alta-emprendimientos/alta-emprendimientos.component';
import { LoginComponent } from './componentes/login/login.component';
import { VistaAdministradorComponent } from './componentes/vista-administrador/vista-administrador.component';
import { VistaEmprendedorComponent } from './componentes/vista-emprendedor/vista-emprendedor.component';
import { EditarUsuarioComponent } from './componentes/editar-usuario/editar-usuario.component';
import { EditarCategoriasComponent } from './componentes/editar-categorias/editar-categorias.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AltaCategoriaComponent } from './componentes/alta-categoria/alta-categoria.component';
import { FooterComponent } from './componentes/footer/footer.component';
import { HeaderComponent } from './componentes/header/header.component';
import { HeadComponent } from './componentes/head/head.component';
import { ScriptComponent } from './componentes/script/script.component';
import { SobreNosotrosComponent } from './componentes/sobre-nosotros/sobre-nosotros.component';
import { ErrorAutenticacionComponent } from './componentes/error-autenticacion/error-autenticacion.component';
import { CerrarSesionComponent } from './componentes/cerrar-sesion/cerrar-sesion.component';
import { EditarDatosCategoriaComponent } from './componentes/editar-datos-categoria/editar-datos-categoria.component';
import { DetalleEmprendimientoComponent } from './componentes/detalle-emprendimiento/detalle-emprendimiento.component';
import { PosteosComponent } from './componentes/posteos/posteos.component';
import { LoginComponentComponent } from './login-component/login-component.component';







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
    FooterComponent,
    HeaderComponent,
    HeadComponent,
    ScriptComponent,
    SobreNosotrosComponent,
    ErrorAutenticacionComponent,
    CerrarSesionComponent,
    EditarDatosCategoriaComponent,
    DetalleEmprendimientoComponent,
    PosteosComponent,
    LoginComponentComponent,
  
   

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
