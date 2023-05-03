package calculadora_salario_test.functionalTests;

import calculadora_salario.CalculadoraDeSalario;
import calculadora_salario.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AvlTest {

    @Test
    public void test01() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", -1.0, "DESENVOLVEDOR");
        assertThrows(Exception.class, () -> CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test02() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 0.0, "DESENVOLVEDOR");
        assertEquals(0.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test03() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 1.0, "DESENVOLVEDOR");
        assertEquals(0.9, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test04() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", 2000.0, "DESENVOLVEDOR");
        assertEquals(1800.0, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test05() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", Double.MAX_VALUE - 1, "DESENVOLVEDOR");
        assertEquals((Double.MAX_VALUE - 1) * 0.8, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test06() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", Double.MAX_VALUE, "DESENVOLVEDOR");
        assertEquals(Double.MAX_VALUE * 0.8, CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

    @Test
    public void test07() {
        Funcionario funcionario = new Funcionario("x", "x@gmail.com", Double.MAX_VALUE + 1, "DESENVOLVEDOR");
        assertThrows(Exception.class, () -> CalculadoraDeSalario.calcularSalarioLiquido(funcionario));
    }

}
