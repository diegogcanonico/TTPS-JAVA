import java.util.Scanner;

import DAOs.impl.UsuarioDAOImpl;
import modelo.Emprendimiento;
import modelo.Rol;
import modelo.Usuario;

public class Main {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		
		Emprendimiento emprendimiento = new Emprendimiento(null, null, null, null, null, null, null, null, null, null, null, null, null);
		Rol rol = new Rol ("Administrador", null);
		Usuario usuario = new Usuario("juan123", "Perez", "Juan", "123", emprendimiento, rol);
		UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();

		System.out.println("A continuación se persiste el usuario con username: juan123, nombre:Juan, apellido: Perez, password:123");
		presionarTeclaParaContinuar();
		usuarioDAO.persistir(usuario);
		System.out.println("A continuación se elimina el usuario con username: juan123, nombre:Juan, apellido: Perez, password:123");
		presionarTeclaParaContinuar();
		usuarioDAO.borrar("juan123");
		System.out.println("A continuación se xxx el usuario con username: juan123, nombre:Juan, apellido: Perez, password:123");
		presionarTeclaParaContinuar();
		
		/**
		transaction.begin();
		usuarioDAO.persistir(usuario);
		transaction.commit();
		RolDAOImpl rolDAO = new RolDAOImpl();
		transaction.begin();
		System.out.println(rolDAO.getRolPorUsername("Pepe"));
		transaction.commit();

**/
	}
	
	static public void presionarTeclaParaContinuar()
    { 
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Presionar Enter para continuar...");
        try
          {
           seguir = teclado.nextLine();
          }   
       catch(Exception e)
        {}  
   }

}
