package entities;

public class Orque extends Besta {

    public Orque(String nome, int pontosVida, int nivelArmadura) {
        super(nome, pontosVida, nivelArmadura);
    }

    @Override
    public void sofrerDano(int dano) {
        super.sofrerDano(dano);
        nivelArmadura -= nivelArmadura * 0.1;
    }
}
