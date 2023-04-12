package gerador_nota_fiscal;

public class GeradorNotaFiscal {

    private NotaFiscalDao notaFiscalDao;
    private SAP sap;
    private Smtp smtp;

    public GeradorNotaFiscal(NotaFiscalDao notaFiscalDao, SAP sap, Smtp smtp) {
        this.notaFiscalDao = notaFiscalDao;
        this.sap = sap;
        this.smtp = smtp;
    }

    public NotaFiscal gerarNotaFiscal(Fatura fatura) {
        return new NotaFiscal("", 0.0, 0.0);
    }

    public void enviarPorEmail(NotaFiscal notaFiscal) {

    }

    public void enviarSAP(NotaFiscal notaFiscal) {
    }

    public void persistirNotaFiscal(NotaFiscal notaFiscal) {
    }
}