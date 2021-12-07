package m;

public class Categoria extends Produto{
    public String tipo;

    @Override
    public String toString() {
        return super.toString()+"Tipo: "+this.tipo;
    }
}
