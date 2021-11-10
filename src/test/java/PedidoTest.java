
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void calcularDesconto() {
        Pedido pedido = new Pedido();
        pedido.descontarValor(200.0f, 20.0f);
        assertEquals(180.0f, pedido.getValor());
    }

    @Test
    void adicionarFrete() {
        Pedido pedido = new Pedido();
        pedido.adicionarFrete(200.0f, 20.0f);
        assertEquals(220.0f, pedido.getValor());
    }

    @Test
    void inserirMaisProdutos() {
        Pedido pedido = new Pedido();
        pedido.inserirMaisProdutos(200.0f, 200.0f);
        assertEquals(400.0f, pedido.getValor());
    }

    @Test
    void retirarProdutos() {
        Pedido pedido = new Pedido();
        pedido.retirarProdutos(900.0f, 300.0f);
        assertEquals(600.0f, pedido.getValor());
    }
}