package gerador_nota_fiscal;

public class Fatura {

    private String nomeCliente;
    private String enderecoCliente;
    private Double valor;
    private TipoServico tipoServico;

    public Fatura(String nomeCliente, String enderecoCliente, Double valor, TipoServico tipoServico) {
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.valor = valor;
        this.tipoServico = tipoServico;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public Double getValor() {
        return valor;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }
}
