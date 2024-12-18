package Computador;

import Computador.Componentes.PlacaMae;
import Computador.Componentes.Processador;

public class Notebook extends Computador {
    public String bateria;
    public Notebook(String bateria, Processador processador, PlacaMae placaMae) {
        super(placaMae, processador);
        this.bateria = bateria;
    }
}
