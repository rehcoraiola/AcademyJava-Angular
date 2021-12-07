public class Aluno extends Pessoa{
    private String curso;
    private int turma;

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setTurma(int turma) {
        this.turma = turma;
    }
    public String getCurso() {
        return curso;
    }
    public int getTurma() {
        return turma;
    }
}
