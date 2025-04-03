package isp;

public class CadastroCliente implements Cadastravel,Verificavel {
	@Override
	public void salvarDB () {
		System.out.println("Cliente inserido.");
	}
	@Override
	public void notificar () {
		System.out.println("Evento: cliente novo.");
	}
	@Override
	public void enviarSMS () {
		System.out.println("Validando...");
	}
}
