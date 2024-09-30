package aparelho.email;

public interface LeitorEmail {
	public void receberEmail();
	
	public void enviarEmail(String email, String assunto, String mensagem);

}
