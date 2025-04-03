package ocp;

public class PersistenciaBD implements Persistencia {
	public void persistir (Fatura fatura) {
		System.out.println("Comportamento simulado.");
		System.out.println("Persistindo no " + "banco");
	}
}
