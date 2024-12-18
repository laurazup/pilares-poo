package Floresta;

public abstract class AnimalImpl implements Animal {
    private String especie;
    public abstract void mover();
    private String comer() {
        System.out.println("Comeu");
        return "";
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String novaEspecie) {
        this.especie = novaEspecie;
    }

}
