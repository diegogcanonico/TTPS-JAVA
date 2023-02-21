import { Categoria } from "./categoria";

export class Emprendimiento {
    id:number;
    nombre:String;
    categoria:Categoria[];

    constructor (id: number, nombre: string, 
        categoria: Categoria[], descripcion: string){
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        }
}
