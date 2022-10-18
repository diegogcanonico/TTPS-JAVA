package DAOs.interfaces;

import java.util.List;

import modelo.Plan;

public interface PlanDAO {
	
	public List<Plan> getPlanesPorNombreEmprendimiento(String nombre);
	
}
