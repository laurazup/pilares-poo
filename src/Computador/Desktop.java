package Computador;

import Computador.Componentes.PlacaMae;
import Computador.Componentes.Processador;

public class Desktop extends Computador {
    public String gabinete;
    public Desktop(PlacaMae placaMae, Processador processador, String gabinete) {
        super(placaMae, processador);
        this.gabinete = gabinete;
    }
    @Override
    public void ligar() {
        System.out.println("Coloca na tomada");
        super.ligar();
        this.mostrarImagem();
    }
}
