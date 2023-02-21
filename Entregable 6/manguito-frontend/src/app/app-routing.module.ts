import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaEmprendimientosComponent } from './emprendedor-emprendimiento/lista-emprendimientos/lista-emprendimientos.component';
import { HomeComponent } from './main-home/home/home.component';
import { MenuComponent } from './main-home/menu/menu.component';
import { EmprendedoresEmprendimientosComponent } from './emprendedor-emprendimiento/emprendedores-emprendimientos/emprendedores-emprendimientos.component';
import { AltaEmprendedoresComponent } from './emprendedor-emprendimiento/alta-emprendedores/alta-emprendedores.component';

const routes: Routes = [
  
    { path: '', redirectTo: 'home', pathMatch: 'full' },

    {path:'home', component:HomeComponent},

    {path:'menu', component:MenuComponent},

    {path:'listarEmprendimientos', component:ListaEmprendimientosComponent},

    {path:'emprendedoresYemprendimientos', component:EmprendedoresEmprendimientosComponent},

    {path:'altaEmprendedorest', component:AltaEmprendedoresComponent},
    
   
  ];








@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }