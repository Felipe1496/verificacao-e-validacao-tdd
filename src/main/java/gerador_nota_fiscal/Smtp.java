package gerador_nota_fiscal;

import java.util.Stack;

public class Smtp {

    private Stack<NotaFiscal> historico;

    public Smtp() {
        this.historico = new Stack<>();
    }

    public void envia(NotaFiscal nf) {
        this.historico.push(nf);
        System.out.println("enviando por email");
    }

    public NotaFiscal getUltimaNotaFiscalEnviada() {
        return this.historico.peek();
    }
}
