package isp;

public class CadastroProduto implements Cadastravel {
	public void salvarDB () {
		System.out.println("Produto inserido.");
	}
	public void notificar () {
		System.out.println("Evento: produto criado.");
	}
}
