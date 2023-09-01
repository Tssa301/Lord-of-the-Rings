package entities;

public class Elfo extends Heroi {

    public Elfo(String nome, int pontosVida, int nivelArmadura) {
        super(nome, pontosVida, nivelArmadura);
    }

    @Override
    public int calcularPoderOfensivo() {
        int poderOfensivo = super.calcularPoderOfensivo();

        if (this.nome.equals("Orque")){
            poderOfensivo += 10;
        }

        return poderOfensivo;
    }
}
