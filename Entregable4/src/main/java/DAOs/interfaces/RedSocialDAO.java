package DAOs.interfaces;

import java.util.List;

import modelo.RedSocial;

public interface RedSocialDAO {
	
	public List<RedSocial> getRedesPorNombreEmprendimiento(String nombre);
	public void borrarPorDominio(String dominio);

}
