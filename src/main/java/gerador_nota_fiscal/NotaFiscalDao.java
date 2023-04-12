package gerador_nota_fiscal;

public class NotaFiscalDao {

    private NotaFiscal notaFiscalPersistida;

    public void salva(NotaFiscal nf) {
        this.notaFiscalPersistida = nf;
        System.out.println("salvando no banco");
    }

    public NotaFiscal getUltimaNotaFiscalPersistida() {
        return this.notaFiscalPersistida;
    }
}
