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
        Double imposto = fatura.getTipoServico().getImposto() * fatura.getValor();
        return new NotaFiscal(fatura.getNomeCliente(), fatura.getValor(), imposto);
    }

    public void enviarPorEmail(NotaFiscal notaFiscal) {
        this.smtp.envia(notaFiscal);
    }

    public void enviarSAP(NotaFiscal notaFiscal) {
        this.sap.envia(notaFiscal);
    }

    public void persistirNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscalDao.salva(notaFiscal);
    }
}