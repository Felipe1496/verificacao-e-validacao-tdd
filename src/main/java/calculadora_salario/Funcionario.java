package calculadora_salario;

public class Funcionario {
    private String nome;
    private String email;
    private Double salarioBase;
    private String cargo;

    public Funcionario(String nome, String email, Double salarioBase, String cargo) {
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public String getCargo() {
        return this.cargo;
    }
}
