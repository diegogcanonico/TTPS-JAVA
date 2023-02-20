export class Emprendimiento {
    id:number;
    nombre:String;
    categoria:String;

    constructor (id: number, nombre: string, 
        categoria: string, descripcion: string){
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        }
}
