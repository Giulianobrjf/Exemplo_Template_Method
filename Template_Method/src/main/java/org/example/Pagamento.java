package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Pagamento {
    private int idPagamento;
    protected List<String> itens;
    private float valor;

    public Pagamento(float valor) {
        this.valor = valor;
        itens = new ArrayList<>();
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public List<String> getItens() {
        return itens;
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public float getValor() {
        return valor;
    }

    public String processarPagamento() {
        String resultadoCalculo = calcularPagamento();
        String resultadoExecucao = executarPagamento();
        enviarConfirmacao();
        return resultadoCalculo + "\n" + resultadoExecucao;
    }

    public abstract String calcularPagamento();
    protected abstract String executarPagamento();

    public void enviarConfirmacao() {
        // Implementação padrão para enviar confirmação
        // Aqui você pode registrar a confirmação ou enviar uma notificação
    }

    public String getResumo() {
        return "Pagamento{" +
                "id=" + idPagamento +
                ", valor=" + valor +
                '}';
    }
}
