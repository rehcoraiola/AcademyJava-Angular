public class Coordenador extends Funcionario{
    private String cursoCordenado;
    private double bonus;

    public void setCursoCordenado(String cursoCordenado) {
        this.cursoCordenado = cursoCordenado;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public String getCursoCordenado() {
        return cursoCordenado;
    }
    public double getBonus() {
        return bonus;
    }
}
