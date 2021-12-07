package Model;
public class Categoria extends Base {
    public String nomeCategoria;

    @Override
    public String toString() {
        String retorno ="\nInformações da Categoria: " +
                        "\n\tID categoria: " + this.id +  
                        "\n\tNome categoria: " + this.nomeCategoria + "\n";
        return retorno;
    }
}