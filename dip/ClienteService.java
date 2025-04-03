package dip;

public class ClienteService {
	
	private Repository<Cliente> repository;
	public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}
	
	public void adicionarCliente(Cliente c) {
		repository.create(c);
	}
}
