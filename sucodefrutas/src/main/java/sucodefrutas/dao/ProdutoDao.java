package sucodefrutas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sucodefrutas.Produto;
import sucodefrutas.util.JPAUtil;

public class ProdutoDao {

	EntityManager em = JPAUtil.getEntityManger();
	
	public void salvar(Produto produto) {
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
	}
	
	public void excluir(Produto produto) {
		Produto find = em.find(Produto.class, produto.getId());
		em.getTransaction().begin();		
		em.remove(find);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listarTodos() {
		String jpql = "select p from Produto p ";
		Query query = em.createQuery(jpql);
		
		return query.getResultList();
	}
}
