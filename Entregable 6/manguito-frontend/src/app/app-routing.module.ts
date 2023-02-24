import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaEmprendimientosComponent } from './emprendedor-emprendimiento/lista-emprendimientos/lista-emprendimientos.component';
import { HomeComponent } from './main-home/home/home.component';
import { MenuComponent } from './main-home/menu/menu.component';
import { EmprendedoresEmprendimientosComponent } from './emprendedor-emprendimiento/emprendedores-emprendimientos/emprendedores-emprendimientos.component';
import { AltaEmprendedoresComponent } from './emprendedor-emprendimiento/alta-emprendedores/alta-emprendedores.component';
import { AltaEmprendimientosComponent } from './emprendedor-emprendimiento/alta-emprendimientos/alta-emprendimientos.component';
import { LoginComponent } from './login/login.component';
import { VistaAdministradorComponent } from './vista-administrador/vista-administrador.component';
import { VistaEmprendedorComponent } from './vista-emprendedor/vista-emprendedor.component';
import { EditarCategoriasComponent } from './editar-categorias/editar-categorias.component';
import { EditarUsuarioComponent } from './editar-usuario/editar-usuario.component';
import { AltaCategoriaComponent } from './alta-categoria/alta-categoria.component';

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
    
  ];








@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }