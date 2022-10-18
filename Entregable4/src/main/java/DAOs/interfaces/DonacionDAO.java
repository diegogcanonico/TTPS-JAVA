package DAOs.interfaces;

import java.util.List;

import modelo.Donacion;

public interface DonacionDAO {
	
	public List<Donacion> getDonacionesPorEmprendimiento(String nombreEmprendimiento);

}
