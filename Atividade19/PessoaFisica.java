public class PessoaFisica {
    private int codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String rg;
    private String cpf;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public String getRg() {
        return rg;
    }
    public String getCpf() {
        return cpf;
    }
}
