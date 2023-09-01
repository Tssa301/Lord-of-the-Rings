package application;

import entities.*;

public class Batalha {
    public static void main(String[] args) {

        //Personagens(Herois)
        Heroi[] exercitoHerois = {
                new Elfo("Legolas", 150, 30),
                new Humano("Aragorn", 150, 50),
                new Humano("Boromir", 100, 60),
                new Humano("Gandalf", 300, 30),
                new Humano("Frodo", 20, 10),
        };

        //Personagens(Bestas)
        Besta[] exercitoBesta = {
                new Orque("Lurtz", 200, 60),
                new Orque("Shagrat", 220, 50),
                new Troll("Ugluk", 120, 30),
                new Troll("Mauhur", 100, 30),
        };


        //application.Batalha
        int turno = 1;

        while (exercitoHerois.length > 0 && exercitoBesta.length > 0) {
            System.out.println("Turno " + turno + ":");

            //Confronto entre os personagens na mesma posição.
            for (int i = 0; i < exercitoHerois.length && i < exercitoBesta.length; i++) {
                Heroi heroi = exercitoHerois[i];
                Besta besta = exercitoBesta[i];

                int poderOfensivoHeroi = heroi.calcularPoderOfensivo();
                int poderOfensivoBesta = besta.calcularPoderOfensivo();

                // Verifica se o poder ofensivo do herói é maior que a armadura da besta
                if (poderOfensivoHeroi > besta.getNivelArmadura()){
                    int danoHeroi = poderOfensivoHeroi - besta.getNivelArmadura();
                    besta.sofrerDano(danoHeroi);
                    System.out.println(heroi.getNome() + " ataca " + besta.getNome() + " causando " + danoHeroi + " de danos.");
                }
                else {
                    System.out.println(heroi.getNome() + " ataca " + besta.getNome() + " mas o ataque não causa danos");
                }

                // Verifica se o poder ofensivo da besta é maior que a armadura do herói
                if (poderOfensivoBesta > heroi.getNivelArmadura()) {
                    int danoBesta = poderOfensivoBesta - heroi.getNivelArmadura();
                    heroi.sofrerDano(danoBesta);
                    System.out.println(besta.getNome() + " ataca " + heroi.getNome() + " causando " + danoBesta + " de danos.");
                }
                else {
                    System.out.println(besta.getNome() + " ataca " + heroi.getNome() + " mas o ataque não causa danos");
                }

                System.out.println(heroi.getNome() + " - Pontos de Vida: " + heroi.getPontosVida());
                System.out.println(besta.getNome() + " - Pontos de Vida: " + besta.getPontosVida());
                System.out.println();
            }//for end//

            //Remover personagens mortas dos exércitos
            exercitoHerois = (Heroi[]) removerPersonEliminada(exercitoHerois);
            exercitoBesta = (Besta[]) removerPersonEliminada(exercitoBesta);

            turno++;
        }//while end//

        // Verificar qual exército venceu a batalha
        if (exercitoHerois.length > 0){
            System.out.println("O Exército dos Heróis venceram!");
        }
        else if (exercitoBesta.length > 0){
            System.out.println("O exército das Feras venceu!");
        }
        else {
            System.out.println("A batalha terminou em empate!");
        }
    }

    public static Personagem[] removerPersonEliminada(Personagem[] exercito) {
        int countVivos = 0;

        for (Personagem personagem : exercito){
            if (personagem.estaVivo()) {
                countVivos ++;
            }
        }

        Personagem[] exercitoAtual = new Personagem[countVivos];
        int i = 0;

        for (Personagem personagem : exercito){
            exercitoAtual[i] = personagem;
            i++;
        }

        return exercitoAtual;
    }
}
