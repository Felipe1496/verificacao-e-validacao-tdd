package gerador_nota_fiscal;

public class Smtp extends Armazem<NotaFiscal>{

    public Smtp() {
        super();
    }

    public void envia(NotaFiscal nf) {
        this.adicionaNoHistorico(nf);
        System.out.println("enviando por email");
    }
}
