package calculadora_salario_test;

import calculadora_salario.CalculadoraDeSalario;
import calculadora_salario.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraSalarioTest {
    @Test
    public void deveCalcularSalarioLiquidoDesenvolvedorComSalarioMaiorOuIgual3000() {
        Funcionario funcionario = new Funcionario("João", "joao@teste.com", 4000.0, "DESENVOLVEDOR");
        double salarioLiquidoEsperado = 3200.0;
        double salarioLiquidoCalculado = CalculadoraDeSalario.calcularSalarioLiquido(funcionario);
        assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0.0);
    }

    @Test
    public void deveCalcularSalarioLiquidoDesenvolvedorComSalarioMenorQue3000() {
        Funcionario funcionario = new Funcionario("Maria", "maria@teste.com", 2000.0, "DESENVOLVEDOR");
        double salarioLiquidoEsperado = 1800.0;
        double salarioLiquidoCalculado = CalculadoraDeSalario.calcularSalarioLiquido(funcionario);
        assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0.0);
    }

    @Test
    public void deveCalcularSalarioLiquidoDbaComSalarioMaiorOuIgual2000() {
        Funcionario funcionario = new Funcionario("Pedro", "pedro@teste.com", 3000.0, "DBA");
        double salarioLiquidoEsperado = 2250.0;
        double salarioLiquidoCalculado = CalculadoraDeSalario.calcularSalarioLiquido(funcionario);
        assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0.0);
    }

    @Test
    public void deveCalcularSalarioLiquidoDbaComSalarioMenorQue2000() {
        Funcionario funcionario = new Funcionario("Ana", "ana@teste.com", 1500.0, "DBA");
        double salarioLiquidoEsperado = 1275.0;
        double salarioLiquidoCalculado = CalculadoraDeSalario.calcularSalarioLiquido(funcionario);
        assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0.0);
    }

    @Test
    public void deveCalcularSalarioLiquidoTestadorComSalarioMaiorOuIgual2000() {
        Funcionario funcionario = new Funcionario("Lucas", "lucas@teste.com", 2500.0, "TESTADOR");
        double salarioLiquidoEsperado = 1875.0;
        double salarioLiquidoCalculado = CalculadoraDeSalario.calcularSalarioLiquido(funcionario);
        assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0.0);
    }

    @Test
    public void deveCalcularSalarioLiquidoTestadorComSalarioMenorQue2000() {
        Funcionario funcionario = new Funcionario("Júlia", "julia@teste.com", 1800.0, "TESTADOR");
        double salarioLiquidoEsperado = 1530.0;
        double salarioLiquidoCalculado = CalculadoraDeSalario.calcularSalarioLiquido(funcionario);
        assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0.0);
    }

    @Test
    public void deveCalcularSalarioLiquidoGerenteComSalarioMaiorOuIgual5000() {
        Funcionario funcionario = new Funcionario("Roberto", "roberto@teste.com", 6000.0, "GERENTE");
        double salarioLiquidoEsperado = 4200.0;
        double salarioLiquidoCalculado = CalculadoraDeSalario.calcularSalarioLiquido(funcionario);
        assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0.0);
    }

    @Test
    public void deveCalcularSalarioLiquidoGerenteComSalarioMenorQue5000() {
        Funcionario funcionario = new Funcionario("Carla", "carla@teste.com", 4000.0, "GERENTE");
        double salarioLiquidoEsperado = 3200.0;
        double salarioLiquidoCalculado = CalculadoraDeSalario.calcularSalarioLiquido(funcionario);
        assertEquals(salarioLiquidoEsperado, salarioLiquidoCalculado, 0.0);
    }
}