package desafioDio;

import desafioDio.model.Contato;
import desafioDio.model.Iphone;
import desafioDio.model.Musica;


public class ModelandoIphone {

    
    public static void main(String[] args) {
         Iphone iphone = new Iphone("iPhone 14", 128);

        // Criando uma música
        Musica musica = new Musica("The Tropper", "Iron Maiden");

        // Criando um contato
        Contato contato = new Contato("João", "1234-5678");

        // Usando o reprodutor musical
        iphone.tocar(musica);
        iphone.pausar();
        iphone.parar();

        // Usando o aparelho telefônico
        iphone.fazerChamada(contato);
        iphone.receberChamada();

        // Usando o navegador
        iphone.navegar("https://www.google.com.br");
        
    }
    
}

