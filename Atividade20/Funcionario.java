public class Funcionario extends Pessoa {
    private double salario;
    private String departamento;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getSalario() {
        return salario;
    }
    public String getDepartamento() {
        return departamento;
    }

}
