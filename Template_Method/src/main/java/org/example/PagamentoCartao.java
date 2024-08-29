package org.example;

public class PagamentoCartao extends Pagamento {
    private static final int MAX_PARCELAS = 2;

    public PagamentoCartao(float valor) {
        super(valor);
    }

    @Override
    public String calcularPagamento() {
        return "Pagamento com cartão disponível em até " + MAX_PARCELAS + " vezes.";
    }

    @Override
    public String executarPagamento() {
        try {
            return "Pagamento com cartão realizado com sucesso.";
        } catch (Exception e) {
            return "Falha ao realizar o pagamento com cartão: " + e.getMessage();
        }
    }

}
