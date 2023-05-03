package calculadora_salario_test.functionalTests;

import calculadora_salario.CalculadoraDeSalario;
import calculadora_salario.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TabelaDecisaoTest {

    @Test
    public void test01() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 1000.0, "DESENVOLVEDOR");
        assertEquals(900.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test02() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 2000.0, "DESENVOLVEDOR");
        assertEquals(1800.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test03() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 4000.0, "DESENVOLVEDOR");
        assertEquals(3200.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test04() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 6000.0, "DESENVOLVEDOR");
        assertEquals(4800.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test05() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 600.0, "DBA");
        assertEquals(510.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test06() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 2400.0, "DBA");
        assertEquals(1800.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test07() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 4300.0, "DBA");
        assertEquals(3225.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test08() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 5500.0, "DBA");
        assertEquals(4125.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test09() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 1400.0, "TESTADOR");
        assertEquals(1190.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test10() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 2900.0, "TESTADOR");
        assertEquals(2175.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test11() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 3900.0, "TESTADOR");
        assertEquals(2925.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test12() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 5100.0, "TESTADOR");
        assertEquals(3825.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test13() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 1500.0, "GERENTE");
        assertEquals(1200.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test14() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 2500.0, "GERENTE");
        assertEquals(2000.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test15() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 4000.0, "GERENTE");
        assertEquals(3200.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test16() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 5000.0, "GERENTE");
        assertEquals(3500.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }
}
