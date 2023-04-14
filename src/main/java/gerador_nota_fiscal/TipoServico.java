package gerador_nota_fiscal;

public enum TipoServico {
    CONSULTORIA(0.25), TREINAMENTO(0.15), OUTRO(0.06);

    private Double imposto;

    TipoServico(Double imposto) {
        this.imposto = imposto;
    }

    public Double getImposto() {
        return this.imposto;
    }

}
