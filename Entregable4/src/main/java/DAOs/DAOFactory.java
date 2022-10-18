package DAOs;

import DAOs.impl.CategoriaDAOImpl;
import DAOs.impl.DonacionDAOImpl;
import DAOs.impl.EmprendimientoDAOImpl;
import DAOs.impl.PlanDAOImpl;
import DAOs.impl.PosteoDAOImpl;
import DAOs.impl.RedSocialDAOImpl;
import DAOs.impl.RolDAOImpl;
import DAOs.impl.UsuarioDAOImpl;
import DAOs.interfaces.CategoriaDAO;
import DAOs.interfaces.DonacionDAO;
import DAOs.interfaces.EmprendimientoDAO;
import DAOs.interfaces.PlanDAO;
import DAOs.interfaces.PosteoDAO;
import DAOs.interfaces.RedSocialDAO;
import DAOs.interfaces.RolDAO;
import DAOs.interfaces.UsuarioDAO;

public class DAOFactory {
	
	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOImpl();
	}
	
	public static CategoriaDAO getCategoriaDAO() {
		return new CategoriaDAOImpl();
	}
	
	public static DonacionDAO getDonacionDAO() {
		return new DonacionDAOImpl();
	}
	
	public static EmprendimientoDAO getEmprendimientoDAO() {
		return new EmprendimientoDAOImpl();
	}
	
	public static PlanDAO getPlanDAO() {
		return new PlanDAOImpl();
	}
	
	public static RedSocialDAO getRedSocialDAO() {
		return new RedSocialDAOImpl();
	}
	
	public static PosteoDAO getPosteoDAO(){
		return new PosteoDAOImpl();
	}
	
	public static RolDAO getRolDAO() {
		return new RolDAOImpl();
	}

}
