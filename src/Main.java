import Computador.Componentes.PlacaMae;
import Computador.Componentes.Processador;
import Computador.Desktop;
import Computador.Notebook;
import Floresta.Leao;

public class Main {
    public static void main(String[] args) {
        PlacaMae placaMae = new PlacaMae();
        Processador processador = new Processador();

        Notebook dell = new Notebook("bateria da dell", processador, placaMae);
        Notebook lenovo = new Notebook("bateria da lenovo", processador, placaMae);
        Desktop mac = new Desktop(placaMae, processador, "ralador de queijo");

        //Abstração e polimorfismo
        Leao leao = new Leao();
        //ERRADO
//        leao.especie = "Felino";
//        System.out.println(leao.especie);
        // CERTO
        leao.setEspecie("Felino");
        System.out.println(leao.getEspecie());
        leao.mover();
    }
}