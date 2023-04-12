package gerador_nota_fiscal;

public class SAP extends Armazem<NotaFiscal> {

    public SAP() {
        super();
    }

    public void envia(NotaFiscal nf) {
        this.adicionaNoHistorico(nf);
        System.out.println("enviando pro sap");
    }
}
