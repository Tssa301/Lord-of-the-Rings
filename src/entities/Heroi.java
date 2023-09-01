package entities;

import java.util.Random;

public class Heroi extends Personagem {

    public Heroi(String nome, int pontosVida, int nivelArmadura) {
        super(nome, pontosVida, nivelArmadura);
    }

    public int calcularPoderOfensivo(){
        int dado1 = lancarDado();
        int dado2 = lancarDado();
        int maaiorValor = Math.max(dado1, dado2);
        return maaiorValor;
    }

    private int lancarDado() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
