package DAOs.interfaces;

import java.util.List;

import modelo.Usuario;

public interface UsuarioDAO {
	
	public Usuario getUsuario(String username);
	public void borrar(String username);
	public List<Usuario> getusuariosPorNombreRol(String nombreRol);
	
}
