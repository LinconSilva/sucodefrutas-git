package sucodefrutas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_app");

	public static EntityManager getEntityManger() {
		return emf.createEntityManager();
	}
	
}
