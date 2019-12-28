package sucodefrutas.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import sucodefrutas.Produto;
import sucodefrutas.dao.ProdutoDao;

@ManagedBean
public class ProdutoBean {
	private Produto produto = new Produto();
	public ProdutoDao produtoDao = new ProdutoDao();
	
	 public void gravar() {
		System.out.println("Gravando dados do suco: " + this.produto.getNome());
		 produtoDao.salvar(produto);
	}
	public List<Produto> getProdutos(){
		
		return produtoDao.listarTodos();
	}
	public void excluir(Produto produto) {
		produtoDao.excluir(produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	
	
}
