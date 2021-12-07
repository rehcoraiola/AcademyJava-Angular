package m;

public class Aluno extends Pessoa{
    public long matricula;
    public String turma;
    public String curso;

    @Override
    public String toString() {
        return super.toString()+"\tMatricula: "+this.matricula+"\tTurma: "+this.turma+"\nCurso: "+this.curso;
    }
    @Override
    public boolean equals(Object obj) {
        Aluno aobj=(Aluno)obj;
        if(this.matricula==aobj.matricula && this.turma.equals(aobj.turma) && this.curso.equals(aobj.curso)&& super.equals(aobj))
            return true;
        return false;
    }
}
