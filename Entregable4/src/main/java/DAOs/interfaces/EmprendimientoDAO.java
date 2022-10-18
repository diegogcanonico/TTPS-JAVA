package DAOs.interfaces;


import modelo.Emprendimiento;

public interface EmprendimientoDAO {
	
	public Emprendimiento getEmprendimientoPorNombre(String nombre);
	public Emprendimiento getEmprendimientoPorUsuario(String username);
	public void borrarPorNombre(String nombre);

}
