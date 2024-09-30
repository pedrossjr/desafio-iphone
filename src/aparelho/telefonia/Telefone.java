package aparelho.telefonia;

public class Telefone implements AparelhoTelefonico{
	public void ligar(String numero) {
		System.out.println("igando para o número " + numero);
	}
	
	public void atender() {
		System.out.println("Atendendo ligação!");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz!");
	}

}
