# Exercícios
## 1. Considere o seguinte cenário:
"Uma oficina mecânica pretende informatizar os atendimentos a seus clientes. Cada atendimento deve conter o nome do cliente, a placa do veículo do cliente, o modelo do veículo, a data do atendimento (em formato dd/mm/aaaa), os problemas encontrados e as medidas tomadas para resolver o problema."

### Resolva os seguintes itens:
1. Identifique todas as principais funções que um sistema computacional precisa ter para atender às necessidades da oficina mecânica, incluindo (e além dessas) as opções de inserção, edição, vizualização e remoção de atendimento;

2. Identifique todas as classes que o sistema precisa ter para atender às necessidades identificadas no item 1;

3. Implemente em Java o método principal (main) de maneira a exibir ao usuário, via interface de texto, as opções de acesso identificadas no item 1;

4. Implemente em Java as classes identificadas no item 2, de modo que o sistema execute as funções necessárias para o seu funcionamento;

5. Discuta as alterações que foram necessárias no sistema desde sua concepção (itens 1 e 2) até sua finalizacão (item 4).

## 2. Resolva o problema abaixo:
Crie uma classe para representar uma conta corrente, com métodos para depositar uma quantia, sacar uma quantia e obter o saldo. Para cada saque, será debitada também uma taxa de operação equivalente à 0,5% do valor sacado. Crie, em seguida, uma subclasse dessa criada, para representar uma conta corrente de um cliente especial. Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado. Além disso, clientes especiais possuem um limite em conta corrente, que permite que saques possam ser efetuados usando tal limite. Faça testes com duas classes e verifique seus resultados.

## 3. Crie uma hierarquia de classes de domínio para uma loja que venda livros, CDs e DVDs.
a. Sobrescreva o método toString() para que imprima:
- Para livros: nome, preço e autor;

- Para CDs: nome, preco e número de faixas;

- Para DVDs: nome, preço e duração.

Evite ao máximo repetição de código utilizando a palavra super no construtor e no método sobrescrito. Em seguida, crie uma classe Loja com o método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor e, por fim, imprime o conteúdo do vetor.

b. Modifique o código do programa anterior da seguinte forma:
- Adicione um atributo que represente o código de barras do produto (é um valor obrigatório e, portanto, deve ser pedido no construtor);

- Sobrescreva o método equals() retornando true se dois produtos possuem o mesmo código de barras;

- Na classe Loja, implemente um simples procedimento de busca que, dado um produto e um vetor de produtos, indique em que posição do vetor se encontra o produto especificado ou imprima que o mesmo não foi encontrado;

- No método Loja.main(), após a impressão do vetor (feita na questão a), escolha um dos 5 produtos e crie duas novas instâncias idênticas a ele: uma com o mesmo código de barras e outra com o código diferente. Efetue a busca deste produto no vetor utilizado as duas instâncias e verifique o resultado.

## 4. Crie a seguinte hierarquia de classes:
- Uma interface para representar qualquer forma geométrica, definindo métodos para cálculo do perímetro e cálculo da área da forma;

- Uma classe abstrata para representar quadriláteros. Seu construtor deve receber os tamanhos dos 4 lados e o método de cálculo do perímetro já pode ser implementado;

- Uma classe para receber um círculo. Seu construtor deve receber o tamanho do raio.

No programa principal, pergunte ao usuário quantas formas ele deseja criar. Em seguida, para cada forma, pergunte se deseja criar um quadrado, um retângulo ou um círculo, solicitando os dados necessários para criar a forma. Todas as formas criadas devem ser armazenadas em um vetor. Finalmente, imprima:

1. Os dados (lados ou raio);
2. Os perímetros; e
3. As áreas de todas as formas.

## 5. Implemente duas interfaces em Java, contendo as declarações de métodos apresentadas entre parênteses:
a. Radio(seEmissora(emissora, tipoEmi); getEmissora(); getTipoEmissora(); setVolumeRadio(volume); getVolumeRadio())

b. Relogio(setHorario(horario); getHorario(); setHorarioAlarme(horario); getHorarioAlarme(); ligarAlarme(); desligarAlarme(); setVolumeRelogio(volume); getVolumeRelogio());

Implemente uma classe RadioRelogio que implemente as duas interfaces. Para atender a implementação das interfaces, quais atributos essa classe necessita