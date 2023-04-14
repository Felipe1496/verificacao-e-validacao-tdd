package gerador_nota_fiscal;

public class NotaFiscal {

    private String nomeCliente;
    private Double valor;
    private Double imposto;

    public NotaFiscal(String nomeCliente, Double valor, Double imposto) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.imposto = imposto;
    }

    public String getCliente() {
        return this.nomeCliente;
    }

    public Double getValor() {
        return this.valor;
    }

    public Double getImposto() {
        return this.imposto;
    }
}
