package Java_pilha;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (Exception ex) {
			String mensagem = ex.getMessage();
			System.out.println("Exception " + mensagem);
			ex.printStackTrace();
		} 	
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaException{
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaException {
		System.out.println("Inicio do metodo2");
		throw new MinhaException("excessão lançada!");
		//System.out.println("Fim do metodo2");
	}
}
















