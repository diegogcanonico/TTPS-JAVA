package DAOs.interfaces;

import modelo.Categoria;

public interface CategoriaDAO {

	public Categoria getCategoria(String nombre);
	public void borrar(String nombre);
	
}
