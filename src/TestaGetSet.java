
public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setAgencia(452);
		System.out.println("A agência da sua conta é: " + conta.getAgencia());
		conta.setNumero(1234);
		System.out.println("O numero da sua conta é: " + conta.getNumero());
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("José Manuel");
		cliente.setCpf("123.123.123.99");
		cliente.setProfissao("Pedreiro");
		conta.setCliente(cliente);
		
		System.out.println("Nome do Cliente: " + conta.getCliente().getNome());
		System.out.println("CPF do Cliente: " + conta.getCliente().getCpf());
		System.out.println("Profissão do Cliente: " + conta.getCliente().getProfissao());
		
		System.out.println();
		
		conta.getCliente().setNome("José Manuel da Silva");
		
		System.out.println("Nome do Cliente: " + conta.getCliente().getNome());
		
		
	}

}
