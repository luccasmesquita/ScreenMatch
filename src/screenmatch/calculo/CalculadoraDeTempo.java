package screenmatch.calculo;

import screenmatch.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
