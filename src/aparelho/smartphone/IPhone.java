package aparelho.smartphone;

import aparelho.email.LeitorEmail;
import aparelho.internet.NavegadorInternet;
import aparelho.musica.ReprodutorMusical;
import aparelho.telefonia.AparelhoTelefonico;

public class IPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico, LeitorEmail{

	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
		
	}
	
	public void atender() {
		System.out.println("Atendendo ligação!");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz!");
		
	}

	public void tocar() {
		System.out.println("Tocando música!");
		
	}

	public void pausar() {
		System.out.println("Pausando música!");
		
	}

	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música " + musica);
		
	}

	public void exibirPagina() {
		System.out.println("Exibindo página!");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba!");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página!");
		
	}

	public void receberEmail() {
		System.out.println("Recebendo email!");
		
	}

	public void enviarEmail(String email, String assunto, String mensagem) {
		System.out.println("Enviando email para: " + email + ", assunto: " + assunto + ", mensagem: " + mensagem);
		
	}
}