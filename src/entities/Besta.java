package entities;

import java.util.Random;

public class Besta extends Personagem {

    public Besta(String nome, int pontosVida, int nivelArmadura) {
        super(nome, pontosVida, nivelArmadura);
    }

    public int calcularPoderOfensivo(){
        Random random = new Random();
        return random.nextInt(91);
    }
}
