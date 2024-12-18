package Computador;
import Computador.Componentes.PlacaMae;
import Computador.Componentes.Processador;

public abstract class Computador {
    protected PlacaMae placaMae;
    protected Processador processador;
    public Computador(PlacaMae placaMae, Processador processador) {
        this.processador = processador;
        this.placaMae = placaMae;
    }
    public void ligar() {
        System.out.println("Apertar o botao");
        System.out.println("Liga o computador");
    }
    protected void mostrarImagem() {
        System.out.println("aparece imagem");
    }
}
