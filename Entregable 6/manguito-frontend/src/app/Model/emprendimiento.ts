import { Categoria } from "./categoria";
import { Usuario } from "./usuario"
import { RedSocial } from "./red-social"
import { Plan } from "./plan"
import { Posteo } from "./posteo"

export class Emprendimiento {
    id:number;
    nombre:String;
    dominio:String;
    descripcion:String;
    banner:String;
    categoria:Categoria[];
    redSocial:RedSocial[];
    precioActualPorManguito:Number;
    planes:Plan[];
    posteos: Posteo[]
    usuario: Usuario;

}
