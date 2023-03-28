/* 
 * Classe que representa um carro
 */
public class Carro {
    // modelo do carro
    private String modelo;
    // velocidade atual do carro
    private int velocidadeAtual;

    /*
     * Construtor da classe.
     * 
     * O carro é construtído com o modelo passado e começa com velocidade zero
     */ 
    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    /* 
     * Retorna o modelo do carro
     */
    public String getModelo() {
        return this.modelo;
    }

    /*
     * Retorna a velocidade atual do carro
     */
    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    /*
     * Acelera o carro, aumentando a sua velocidade em 5 unidades
     */
    public void acelerar() {
        this.velocidadeAtual += 5;
    }

    /*
     * Reduz a velocidade do carro em 5 unidades.
     * A velocidade não pode se tornar negativa, retorna false se a velocidade não foi reduzida por causa disso
     */
    public boolean reduzir() {        
        if (this.velocidadeAtual - 5 >= 0) {
            this.velocidadeAtual -= 5;
            return true;
        }
        else {
            return false;
        }
    }
}
