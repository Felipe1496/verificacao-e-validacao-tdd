package calculadora_salario_test.functionalTests;

import calculadora_salario.CalculadoraDeSalario;
import calculadora_salario.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParticaoEquivalenciaTest {
    @Test
    public void test01() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 2400.0, "DESENVOLVEDOR");
        assertEquals(2160.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test02() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 5000.0, "DBA");
        assertEquals(3750.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test03() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 4000.0, "TESTADOR");
        assertEquals(3000.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test04() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 6500.0, "GERENTE");
        assertEquals(4550, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test05() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 1233.0, "OUTRO");
        assertThrows(Exception.class, () -> CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }
}
