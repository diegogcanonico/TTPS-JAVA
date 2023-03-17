import { Emprendimiento } from "./emprendimiento";

export class Donacion {
    id:number;
    cantidadManguitos:number;
    nombreDonador:string;
    mensaje:string;
    emprendimientoId:number;
    fecha: Date;
    emprendimiento:Emprendimiento
}
