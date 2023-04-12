package calculadora_salario;

import java.util.HashMap;
import java.util.Map;

public class CalculadoraDeSalario {
    public static double calcularSalarioLiquido(Funcionario funcionario) {
        switch (funcionario.getCargo()) {
            case "DESENVOLVEDOR":
                if (funcionario.getSalarioBase() >= 3000) {
                    return funcionario.getSalarioBase() * 0.8;
                }

                return funcionario.getSalarioBase() * 0.9;
            case "DBA":
            case "TESTADOR":
                if (funcionario.getSalarioBase() >= 2000) {
                    return funcionario.getSalarioBase() * 0.75;
                }

                return funcionario.getSalarioBase() * 0.85;
            case "GERENTE":
                if (funcionario.getSalarioBase() >= 5000) {
                    return funcionario.getSalarioBase() * 0.7;
                }

                return funcionario.getSalarioBase() * 0.8;
            default:
                return funcionario.getSalarioBase();
        }
    }
}
