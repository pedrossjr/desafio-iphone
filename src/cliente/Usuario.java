package cliente;

import aparelho.smartphone.IPhone;
import aparelho.email.LeitorEmail;
import aparelho.internet.NavegadorInternet;
import aparelho.musica.ReprodutorMusical;
import aparelho.telefonia.AparelhoTelefonico;

public class Usuario {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		LeitorEmail mail = iphone;
		NavegadorInternet safari = iphone;
		ReprodutorMusical ipod = iphone;
		AparelhoTelefonico telefone = iphone;
		
		mail.enviarEmail("pedrosilva@gmail.com", "Festa", "Olá Pedro, vai a festa hoje a noite?");
		mail.receberEmail();
		
		safari.exibirPagina();
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		
		ipod.tocar();
		ipod.selecionarMusica("Green Day - Boulevard Of Broken Dreams");
		ipod.pausar();
	}
}
