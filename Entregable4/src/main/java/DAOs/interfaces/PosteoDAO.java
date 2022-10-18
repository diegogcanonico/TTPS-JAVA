package DAOs.interfaces;

import java.util.List;

import modelo.Posteo;

public interface PosteoDAO {
	
	public List<Posteo> getPosteosPorNombreEmprendimiento(String nombre);

}
