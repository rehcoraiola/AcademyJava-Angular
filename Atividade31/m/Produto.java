package m;

public class Produto extends Base {
    public String nome;

    @Override
    public String toString() {
        return super.toString()+"Nome: "+this.nome;
    }
    
}