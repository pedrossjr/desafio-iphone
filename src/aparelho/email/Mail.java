package aparelho.email;

public class Mail implements LeitorEmail {
	public void receberEmail() {
		System.out.println("Recebendo email.");
	}
	
	public void enviarEmail(String email, String assunto, String mensagem) {
		System.out.println("Enviando email para: " + email + ", assunto: " + assunto + ", mensagem: " + mensagem);
	}
}
