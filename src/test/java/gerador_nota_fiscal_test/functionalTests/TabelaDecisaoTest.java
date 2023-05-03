package gerador_nota_fiscal_test.functionalTests;

import gerador_nota_fiscal.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TabelaDecisaoTest {
    private GeradorNotaFiscal geradorNotaFiscal;

    @BeforeEach
    void setUp() {
        NotaFiscalDao notaFiscalDao = new NotaFiscalDao();
        SAP sap = new SAP();
        Smtp smtp = new Smtp();
        this.geradorNotaFiscal = new GeradorNotaFiscal(notaFiscalDao, sap, smtp);
    }

    @Test
    void testoConsultoria() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", 400.0, TipoServico.CONSULTORIA);
        NotaFiscal notaFiscal = this.geradorNotaFiscal.gerarNotaFiscal(fatura);

        assertEquals(100.0, notaFiscal.getImposto());
    }

    @Test
    void testTreinamento() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", 400.0, TipoServico.TREINAMENTO);
        NotaFiscal notaFiscal = this.geradorNotaFiscal.gerarNotaFiscal(fatura);

        assertEquals(60.0, notaFiscal.getImposto());
    }

    @Test
    void testOutro() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", 400.0, TipoServico.OUTRO);
        NotaFiscal notaFiscal = this.geradorNotaFiscal.gerarNotaFiscal(fatura);

        assertEquals(24.0, notaFiscal.getImposto());
    }
}
