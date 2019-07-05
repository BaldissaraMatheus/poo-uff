## Exercício de herança
Em um sistema de loja, há 3 tipos de usuário: gerente, funcionário e cliente. Todo usuário tem nome e senha. O cliente possui, além do nome e senha, outros dados cadastrais. O funcionário possui métodos relacionados a venda de produtos. O gerente pode fazer tudo que o funcionário pode e também fechamento do caixa. Como é a hierarquia de herança desse sistema no que se refere a controle de usuários?

## Refazer o exercício da Agenda, que lista os contados ordenados por nome e por idade
* Fazer uma classe abstrata Ordenador com a lógica de ordenação, porém chamando um método abstrato compara (Pessoa, Pessoa);

## Exercício
* Criar duas classes extras, OrdenadorNome e OrdenadorIdade, que herdam de Ordenador e implementam o método abstrato compara(Pessoa, Pessoa);

* Instanciar o ordenador apropriado para listar os contatos por nome e por idade.

## Exercício
* Faça uma classe Animal com o método abstrato "fala";

* Faça as classes Homem, Cão e Gato, herdando de animal, redefinindo o método "fala" para retornar "Oi", "Au au" e "Miau" respectivamente;

* Crie um vetor de 10 Animais e instancie Homens, Cães e Gatos nesse vetor;

* Faça um loop por todos os Animais do vetor, pedindo para eles falarem.