package entities;

public class Personagem {

    protected String nome;
    protected int pontosVida;
    protected int nivelArmadura;

    public Personagem(String nome, int pontosVida, int nivelArmadura) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.nivelArmadura = nivelArmadura;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public int getNivelArmadura() {
        return nivelArmadura;
    }

    public void sofrerDano(int dano){
        pontosVida -= dano;

        if (pontosVida < 0){
            pontosVida = 0;
        }
    }

    public boolean estaVivo(){
        return pontosVida > 0;
    }
}
