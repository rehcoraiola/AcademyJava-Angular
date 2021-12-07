public class Pessoa {
    private String nome;
    private String sobrenome;
    private long matricula;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public long getMatricula() {
        return matricula;
    }
    
}