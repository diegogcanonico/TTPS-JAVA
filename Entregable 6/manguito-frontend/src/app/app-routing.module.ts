import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaEmprendimientosComponent } from './componentes/lista-emprendimientos/lista-emprendimientos.component';
import { HomeComponent } from './componentes/home/home.component';
import { MenuComponent } from './componentes/menu/menu.component';
import { EmprendedoresEmprendimientosComponent } from './componentes/emprendedores-emprendimientos/emprendedores-emprendimientos.component';
import { AltaEmprendedoresComponent } from './componentes/alta-emprendedores/alta-emprendedores.component';
import { AltaEmprendimientosComponent } from './componentes/alta-emprendimientos/alta-emprendimientos.component';
import { LoginComponent } from './componentes/login/login.component';
import { VistaAdministradorComponent } from './componentes/vista-administrador/vista-administrador.component';
import { VistaEmprendedorComponent } from './componentes/vista-emprendedor/vista-emprendedor.component';
import { EditarCategoriasComponent } from './componentes/editar-categorias/editar-categorias.component';
import { EditarUsuarioComponent } from './componentes/editar-usuario/editar-usuario.component';
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


const routes: Routes = [
  
    {path: '', redirectTo: 'home', pathMatch: 'full' },
    {path:'home', component:HomeComponent},
    {path:'menu', component:MenuComponent},
    {path:'listarEmprendimientos', component:ListaEmprendimientosComponent},
    {path:'emprendedoresYemprendimientos', component:EmprendedoresEmprendimientosComponent},
    {path:'altaEmprendedorest', component:AltaEmprendedoresComponent},
    {path:'altaEmprendimientos', component:AltaEmprendimientosComponent},
    {path:'login', component:LoginComponent},
    {path:'vistaAdministrador', component:VistaAdministradorComponent},
    {path:'vistaEmprendedor', component:VistaEmprendedorComponent},
    {path:'editarCategoria', component:EditarCategoriasComponent},
    {path:'editarUsuario', component:EditarUsuarioComponent},
    {path:'altaCategoria', component:AltaCategoriaComponent},
    {path:'footer', component:FooterComponent},
    {path:'header', component:HeaderComponent},
    {path:'head', component:HeadComponent},
    {path:'script', component:ScriptComponent},
    {path:'sobreNosotros', component:SobreNosotrosComponent},
    {path:'errorAutenticacionComponent', component:ErrorAutenticacionComponent},
    {path:'cerrarSesionComponent', component:CerrarSesionComponent},
    {path:'editarDatosCategoria', component:EditarDatosCategoriaComponent},
    {path: 'detalle-emprendimiento/:id', component: DetalleEmprendimientoComponent },
    {path: 'posteos/:id', component: PosteosComponent },
    
  ];








@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }