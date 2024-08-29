package org.example;

public class PagamentoPix extends Pagamento {
    private static final float DESCONTO_PIX = 0.10f; // Desconto de 10%

    public PagamentoPix(float valor) {
        super(valor);
    }

    @Override
    public String calcularPagamento() {
        float valorComDesconto = getValor() * (1 - DESCONTO_PIX);
        return "Valor com desconto de 10% para pagamento com PIX: " + valorComDesconto;
    }

    @Override
    public String executarPagamento() {
            try {
                return "Pagamento com pix realizado com sucesso.";
            } catch (Exception e) {
                return "Falha ao realizar o pagamento com pix: " + e.getMessage();
            }
    }

}
