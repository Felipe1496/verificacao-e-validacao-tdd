package gerador_nota_fiscal;

public class SAP {

    private NotaFiscal notaFiscalEnviada;

    public void envia(NotaFiscal nf) {
        this.notaFiscalEnviada = nf;
        System.out.println("enviando pro sap");
    }

    public NotaFiscal getUltimaNotaFiscalEnviada() {
        return this.notaFiscalEnviada;
    }
}
