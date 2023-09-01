package entities;

import entities.Heroi;

public class Hobbit extends Heroi {

    public Hobbit(String nome, int pontosVida, int nivelArmadura) {
        super(nome, pontosVida, nivelArmadura);
    }

    @Override
    public int calcularPoderOfensivo() {
        int poderOfensivo = super.calcularPoderOfensivo();

        if (this.nome.equals("Troll")){
            poderOfensivo -= 5;
        }

        return poderOfensivo;
    }
}


