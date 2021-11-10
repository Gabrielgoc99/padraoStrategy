

public class Pedido {

    private float valor;

    public float getValor() {
        return valor;
    }

    public void descontarValor(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new FuncaoDesconto());
    }

    public void adicionarFrete(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new FuncaoFrete());
    }

    public void inserirMaisProdutos(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new FuncaoInserirMaisProdutos());
    }

    public void retirarProdutos(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new FuncaoRetirarProdutos());
    }

}