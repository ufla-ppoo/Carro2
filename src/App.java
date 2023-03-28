import java.util.Scanner;

/*
 * Classe que gera um programa que uso um objeto da classe Carro.
 * 
 * Código até o Passo 4
 */
public class App {
    public static void main(String[] args) {
        // Cria o objeto scanner para obter dados do usuário
        Scanner entrada = new Scanner(System.in);
        
        // Pede ao usuário o modelo do carro a ser criado
        System.out.print("Digite o modelo do carro: ");
        String modelo = entrada.nextLine();

        // Cria um objeto do tipo carro com o modelo passado pelo usuário
        Carro carro = new Carro(modelo);

        // Exibe as informações do carro na tela
        System.out.println("Carro " + carro.getModelo() + " criado!");
        System.out.println("Velocidade inicial é: " + carro.getVelocidadeAtual());

        // Perguntar ao usuário quantas vezes ele quer acelerar o carro
        System.out.print("Quantas vezes você quer acelerar o carro? ");
        int aceleracoes = Integer.parseInt(entrada.nextLine());

        // linhas para acelerar o carro e depois exiba novamente as informações dele.
        System.out.println("Acelerando o carro...");
        for (int i = 0; i < aceleracoes; i++) {
            carro.acelerar();
        }
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual());

        // fecha o objeto Scanner para liberar os seus recursos
        // Sem isso, o VS Code fica exibindo um aviso: "Resource leak: 'entrada' is never closed"
        entrada.close();
    }    
}
