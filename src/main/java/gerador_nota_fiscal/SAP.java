package gerador_nota_fiscal;

import java.util.Stack;

public class SAP {

    private Stack<NotaFiscal> historico;

    public SAP() {
        this.historico = new Stack<>();
    }

    public void envia(NotaFiscal nf) {
        this.historico.push(nf);
        System.out.println("enviando pro sap");
    }

    public NotaFiscal getUltimaNotaFiscalEnviada() {
        return this.historico.peek();
    }
}
