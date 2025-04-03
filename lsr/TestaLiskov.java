package lsr;

public class TestaLiskov {
	public static void main(String[] args) {
		Funcionario a = new Analista();
		imprimir (a);
		Funcionario v = new Vendedor();
		imprimir (v);
	}
	
	private static void imprimir(Funcionario funcionario) {
		System.out.println("Salário: " + funcionario.getSalario());
	}

}
