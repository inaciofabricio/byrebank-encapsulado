
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(123,4567);

		Conta conta2 = new Conta(357,9848);
		
		Conta conta3 = new Conta(582,5821);
		
		System.out.println("O total de contas é: " + Conta.getTotal());

	}

}
