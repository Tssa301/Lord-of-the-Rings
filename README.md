# Lord-of-the-Rings
Tokio - Projeto Final: implementação de um simples jogo baseado na história fantástica do livro do Senhor dos Anéis.

No jogo irão existir diversas personagens classificadas em duas categorias: Heróis e Bestas.
Na parte dos heróis poderão criar-se vários tipos de personagens: Elfos, Hobbits e Humanos
enquanto que na parte das bestas irão existir Orques e Trolls.

O objetivo do jogo é a criação de dois exércitos de personagens, um de heróis e outro de
bestas, que se irão enfrentar entre eles, mediante um sistema de turnos, até que um deles
consiga a vitória. Para isso, cada personagem estará caracterizada por um nome, pontos de
vida (número inteiro) e um nível de resistência da sua armadura (número inteiro). Em cada
turno, uma personagem poderá atacar um adversário.

Para simplificar o sistema de batalha, irão enfrentar-se sempre as personagens situadas na
mesma posição de cada exército. Se algum dos exércitos dispõe de mais efetivos que o
contrário as restantes personagens não irão participar nesse turno de batalha. Em cada turno
irão produzir-se todos confrontos e irá diminuir a vida de cada personagem.

No momento em que uma personagem chegue a um nível de vida igual ou inferior a zero irá
produzir-se a sua morte pelo que irá eliminar-se da sua posição e irão deslocar-se todos os
seus companheiros em posições posteriores para cobrir a baixa. Dessa forma alguma das
personagens inativas poderá participar na batalha nos seguintes turnos.

## Esquema Projeto
![image](https://github.com/Tssa301/Lord-of-the-Rings/assets/64556958/5011de18-6a06-447e-991f-a74e1fad4fa7)



