package desafioDio;

import desafioDio.model.Musica;

public interface ReprodutorMusical {
    public void tocar(Musica musica);
    public void pausar();
    public void parar();
}
