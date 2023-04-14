package gerador_nota_fiscal;

public class NotaFiscalDao extends Armazem<NotaFiscal> {

    public void salva(NotaFiscal nf) {
        this.adicionaNoHistorico(nf);
        System.out.println("salvando no banco");
    }
}
