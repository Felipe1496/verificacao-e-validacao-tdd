package gerador_nota_fiscal;

public class Smtp {

    private NotaFiscal notaFiscalEnviada;

    public void envia(NotaFiscal nf) {
        this.notaFiscalEnviada = nf;
        System.out.println("enviando por email");
    }

    public NotaFiscal getUltimaNotaFiscalEnviada() {
        return this.notaFiscalEnviada;
    }
}
