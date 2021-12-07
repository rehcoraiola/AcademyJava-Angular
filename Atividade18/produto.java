public class produto{
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public void setValor(Double valor){
        this.valor=valor;
    }

    public int getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public double getValor(){
        return this.valor;
    }
} 