package gerador_nota_final_test;

import gerador_nota_fiscal.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeradorNotaFiscalTest {

    private GeradorNotaFiscal geradorNotaFiscal;
    private NotaFiscalDao notaFiscalDao;
    private SAP sap;
    private Smtp smtp;

    @BeforeEach
    void setUp() {
        notaFiscalDao = new NotaFiscalDao();
        sap = new SAP();
        smtp = new Smtp();
        geradorNotaFiscal = new GeradorNotaFiscal(notaFiscalDao, sap, smtp);
    }

    @Test
    void testGerarNotaFiscalServicoConsultoria() {
        Fatura fatura = new Fatura("João da Silva", "Rua dos Bobos, 0", 500.0, TipoServico.CONSULTORIA);
        NotaFiscal notaFiscal = geradorNotaFiscal.gerarNotaFiscal(fatura);
        assertEquals("João da Silva", notaFiscal.getCliente());
        assertEquals(500.0, notaFiscal.getValor());
        assertEquals(125.0, notaFiscal.getImposto());
    }

    @Test
    void testGerarNotaFiscalServicoTreinamento() {
        Fatura fatura = new Fatura("Maria Souza", "Avenida Brasil, 1000", 1000.0, TipoServico.TREINAMENTO);
        NotaFiscal notaFiscal = geradorNotaFiscal.gerarNotaFiscal(fatura);
        assertEquals("Maria Souza", notaFiscal.getCliente());
        assertEquals(1000.0, notaFiscal.getValor());
        assertEquals(150.0, notaFiscal.getImposto());
    }

    @Test
    void testGerarNotaFiscalServicoQualquerOutro() {
        Fatura fatura = new Fatura("Pedro Oliveira", "Rua das Flores, 50", 2000.0, TipoServico.OUTRO);
        NotaFiscal notaFiscal = geradorNotaFiscal.gerarNotaFiscal(fatura);
        assertEquals("Pedro Oliveira", notaFiscal.getCliente());
        assertEquals(2000.0, notaFiscal.getValor());
        assertEquals(120.0, notaFiscal.getImposto());
    }

    @Test
    void testEnviarNotaFiscalPorEmail() {
        Fatura fatura = new Fatura("Carlos Silva", "Rua das Palmeiras, 200", 800.0, TipoServico.OUTRO);
        NotaFiscal notaFiscal = geradorNotaFiscal.gerarNotaFiscal(fatura);
        geradorNotaFiscal.enviarPorEmail(notaFiscal);
        // Verifica se o método de envio por e-mail foi chamado com a nota fiscal correta
        assertEquals(notaFiscal, smtp.getUltimoAdicionado());
    }

    @Test
    void testEnviarNotaFiscalSAP() {
        Fatura fatura = new Fatura("Cliente Teste", "Rua Teste, 123", 1000.0, TipoServico.CONSULTORIA);
        NotaFiscal notaFiscal = geradorNotaFiscal.gerarNotaFiscal(fatura);

        geradorNotaFiscal.enviarSAP(notaFiscal);
        assertEquals(notaFiscal, sap.getUltimoAdicionado());
    }

    @Test
    void testPersistirNotaFiscalNoBanco() {
        Fatura fatura = new Fatura("Ana Maria", "Rua das Margaridas, 500", 1500.0, TipoServico.OUTRO);
        NotaFiscal notaFiscal = geradorNotaFiscal.gerarNotaFiscal(fatura);
        geradorNotaFiscal.persistirNotaFiscal(notaFiscal);

        assertEquals(notaFiscal, notaFiscalDao.getUltimoAdicionado());
    }
}