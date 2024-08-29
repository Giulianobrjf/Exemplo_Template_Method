import org.example.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PagamentoPixTest {

    @Test
    public void deveRetornarValorComDesconto() {
        PagamentoPix pagamentoPix = new PagamentoPix(100.0f);
        assertEquals("Valor com desconto de 10% para pagamento com PIX: 90.0", pagamentoPix.calcularPagamento());
    }

    @Test
    public void deveRetornarMensagemDeSucesso() {
        PagamentoPix pagamentoPix = new PagamentoPix(100.0f);
        assertEquals("Pagamento com pix realizado com sucesso.", pagamentoPix.executarPagamento());
    }

    @Test
    public void deveRetornarResumo() {
        PagamentoPix pagamentoPix = new PagamentoPix(100.0f);
        pagamentoPix.setIdPagamento(1);
        assertEquals("Pagamento{id=1, valor=100.0}", pagamentoPix.getResumo());
    }
}
