package m;

public class Prato extends Base{
    public String proteina;
    public double valor;

    @Override
    public String toString() {
        return super.toString()+"\tProteina: "+this.proteina+"\tValor: R$"+this.valor;
    }
}
