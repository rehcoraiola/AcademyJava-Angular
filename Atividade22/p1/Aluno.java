package p1;

public class Aluno {
    private String nomeCompleto;
    private int idade;
    private int matricula;

    public Aluno(String nomeCompleto,int idade,int matricula){
        this.nomeCompleto=nomeCompleto;
        this.idade=idade;
        this.matricula=matricula;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public int getIdade() {
        return idade;
    }
    public int getMatricula() {
        return matricula;
    }
    @Override
    public String toString() {
        String msg="Nome Completo: "+this.nomeCompleto+"\nIdade: "+this.idade+"\nMatricula: "+this.matricula;
        return msg;
    }
    
}