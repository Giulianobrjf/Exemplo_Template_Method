import org.example.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PagamentoCartaoTest {

    @Test
    public void deveRetornarInformacoesParcelamento() {
        PagamentoCartao pagamentoCartao = new PagamentoCartao(200.0f);
        assertEquals("Pagamento com cartão disponível em até 2 vezes.", pagamentoCartao.calcularPagamento());
    }

    @Test
    public void deveRetornarMensagemDeSucesso() {
        PagamentoCartao pagamentoCartao = new PagamentoCartao(200.0f);
        assertEquals("Pagamento com cartão realizado com sucesso.", pagamentoCartao.executarPagamento());
    }

    @Test
    public void deveRetornarResumo() {
        PagamentoCartao pagamentoCartao = new PagamentoCartao(200.0f);
        pagamentoCartao.setIdPagamento(2);
        assertEquals("Pagamento{id=2, valor=200.0}", pagamentoCartao.getResumo());
    }
}
