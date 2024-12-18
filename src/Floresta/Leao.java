package Floresta;

public class Leao extends AnimalImpl {
    private void rugir() {
        System.out.println("Rugido do leão");
    }

    @Override
    public void mover() {
        System.out.println("Andar");
    }
}
