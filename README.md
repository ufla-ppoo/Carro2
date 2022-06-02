# Carro 2.0

Implementação um programa simples, mas completo, em Java com uma classe para representar carros e outra com interação com o usuário.

Esse programa é uma possível solução para uma sequência de exercícios usada em disciplinas de Orientação a Objetos.

A sugestão é que você faça os exercícios listados abaixo sem olhar o código presente aqui e, depois de pronto, confira a resposta.

## Exercícios

### 1. Classe Carro

A partir da sintaxe básica abaixo, crie o código Java para uma classe `Carro` conforme descrita no slide anterior (com nome, velocidade, construtor e métodos de acesso aos atributos).

Exemplo de código Java:

```java
public class NomeDaClasse {

	// Atributos
	private int atrituboInteiro;
	private String atributoString;

	// Construtor
	public NomeDaClasse() {
		...		
	}

	// Método
	public int getAtributoInteiro() {
		return atributoInteiro;
	}
}
```

### 2. Primeiro Programa

Crie uma classe que tem o método `main`. Dentro do método, crie um objeto do tipo `Carro` cujo nome seja Fusca e, em seguida, exiba suas informações na tela.

Exemplo de código Java:

```java
public class Programa {

	public static void main(String[] args) {
		
		NomeDaClasse var = new NomeDaClasse();
		
		int a = var.getAtributoInteiro();
	
		...
	}	
}
```

### 3. Acelerando

Vamos melhorar nosso exemplo. Crie na classe `Carro` os métodos `acelerar` e `reduzir` que aumentam e diminuem, respectivamente, a velocidade do carro em 10 unidades.
Altere a classe principal adicionando linhas para acelerar o carro e depois exiba novamente as informações dele.

### 4. Obtendo dados do usuário

Altere o programa do exercício anterior de forma a obter do usuário o nome do carro a ser criado e a quantidade de vezes que o carro será acelerado. Por fim, exiba os dados do carro criado.

### 5. Menu

Altere o programa do exercício anterior de forma que ele exiba o menu abaixo e execute as ações do menu. Deve ser criado um método separado para exibição do menu e outro para tratar a opção de menu escolhida pelo usuário.

```
1. Criar o carro
2. Acelerar o carro
3. Reduzir a velocidade
4. Exibir os dados do carro
5. Sair
```

### 6. Evitando atributos e métodos estáticos

O fato do método `main` ser estático em Java, acaba levando a declarações de atributos e métodos estáticos dentro da mesma classe. Mas, conceitualmente, muitas vezes não faria muito sentido eles serem estáticos.

Por isso, uma boa prática é deixar a classe que tem o método `main` tendo apenas esse método, e dentro dele criar um objeto de uma classe que realmente é a classe principal do programa. Dessa forma, dentro da classe principal, os atributos e métodos não precisam ser declarados abstratos.

Portanto, nesse passo faça o seguinte:
- Crie uma classe chamada `Principal` e leve para ela os atributos e métodos que antes estavam na classe que tem o método `main`. 
  - Deixe o loop do menu em um método chamado executar.
  - Lembre-se que os atributos e métodos da classe `Principal` não devem ser estáticos!
- Altere o método `main` da outra classe para que ele tenha apenas os seguintes comandos:
  - Declare e crie um objeto da classe `Principal`.
  - Chame o método `executar` do objeto criado.

### 7. Trabalhando com vetores

Vamos agora alterar a classe `Principal` para que ela passe a trabalhar com um vetor de carros de 5 posições. Faça as alterações necessárias para tratar o vetor, dentre elas:
- Declare o atributo e crie-o no construtor.
- Altere a opção criar carro, para que ele crie até 5 carros.
  - Depois disso, o usuário deve ser informado que não é possível criar mais carros.
- Altere as opções acelerar e reduzir do menu pedindo ao usuário qual carro ele quer tratar.
  - Para isso, peça o nome do carro ao usuário e o encontre no vetor.
- Altere a opção exibir do menu para que exiba as informações de todos os carros já criados.

```java
// Declaração de um vetor
private Classe[] vetor;
	
// Criação de um vetor
vetor = new Classe[10];

// Loop em um vetor por posição
for (int i = 0; i < vetor.length; i++){
    Carro c = vetor[i];
    c.acelerar();
}

// Loop em um vetor usando for-each
for (Carro c : vetor){
    c.acelerar();
}
```