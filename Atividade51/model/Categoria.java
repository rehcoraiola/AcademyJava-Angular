package model;

public class Categoria {
    private int id;
    private String nome;

    public Categoria(String nome){
        this.nome=nome;
    }
    public Categoria(int id,String nome){
        this.id=id;
        this.nome=nome;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return String.format("%d - %s - %s  \n",this.id,this.nome);
    }
}
