
public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setAgencia(452);
		System.out.println("A ag�ncia da sua conta �: " + conta.getAgencia());
		conta.setNumero(1234);
		System.out.println("O numero da sua conta �: " + conta.getNumero());
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Jos� Manuel");
		cliente.setCpf("123.123.123.99");
		cliente.setProfissao("Pedreiro");
		conta.setCliente(cliente);
		
		System.out.println("Nome do Cliente: " + conta.getCliente().getNome());
		System.out.println("CPF do Cliente: " + conta.getCliente().getCpf());
		System.out.println("Profiss�o do Cliente: " + conta.getCliente().getProfissao());
		
		System.out.println();
		
		conta.getCliente().setNome("Jos� Manuel da Silva");
		
		System.out.println("Nome do Cliente: " + conta.getCliente().getNome());
		
		
	}

}
