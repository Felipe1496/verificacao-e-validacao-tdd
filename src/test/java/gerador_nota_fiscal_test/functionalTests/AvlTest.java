package gerador_nota_fiscal_test.functionalTests;

import gerador_nota_fiscal.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AvlTest {
    private GeradorNotaFiscal geradorNotaFiscal;

    @BeforeEach
    void setUp() {
        NotaFiscalDao notaFiscalDao = new NotaFiscalDao();
        SAP sap = new SAP();
        Smtp smtp = new Smtp();
        this.geradorNotaFiscal = new GeradorNotaFiscal(notaFiscalDao, sap, smtp);
    }

    @Test
    void testMinimo() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", 0.0, TipoServico.CONSULTORIA);
        NotaFiscal notaFiscal = this.geradorNotaFiscal.gerarNotaFiscal(fatura);

        assertEquals(0.0, notaFiscal.getImposto());
    }

    @Test
    void testLogoAcimaMinimo() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", 1.0, TipoServico.CONSULTORIA);
        NotaFiscal notaFiscal = this.geradorNotaFiscal.gerarNotaFiscal(fatura);

        assertEquals(0.25, notaFiscal.getImposto());
    }

    @Test
    void testValorQualquer() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", 400.0, TipoServico.CONSULTORIA);
        NotaFiscal notaFiscal = this.geradorNotaFiscal.gerarNotaFiscal(fatura);

        assertEquals(100, notaFiscal.getImposto());
    }

    @Test
    void testMaximo() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", Double.MAX_VALUE, TipoServico.CONSULTORIA);
        NotaFiscal notaFiscal = this.geradorNotaFiscal.gerarNotaFiscal(fatura);

        assertEquals((Double.MAX_VALUE / 100) * 25, notaFiscal.getImposto());
    }

    @Test
    void testLogoAbaixoMaximo() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", Double.MAX_VALUE - 1, TipoServico.CONSULTORIA);
        NotaFiscal notaFiscal = this.geradorNotaFiscal.gerarNotaFiscal(fatura);

        assertEquals(((Double.MAX_VALUE - 1) / 100) * 25, notaFiscal.getImposto());
    }

    @Test
    void testMinimoMenosUm() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", Double.MIN_VALUE - 1, TipoServico.CONSULTORIA);

        assertThrows(Exception.class,() -> this.geradorNotaFiscal.gerarNotaFiscal(fatura));
    }

    @Test
    void testMaximoMaisUm() {
        Fatura fatura = new Fatura("John Doe", "Rua anywhere, 666", Double.MIN_VALUE + 1, TipoServico.CONSULTORIA);

        assertThrows(Exception.class,() -> this.geradorNotaFiscal.gerarNotaFiscal(fatura));
    }
}
