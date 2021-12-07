package m;

public class Carro {
    public int numPortas;
    public int capacidade;
    
    @Override
    public String toString() {
        return "Numero de Portas: "+this.numPortas+"\tCapacidade Porta-malas: "+this.capacidade;
    }
}
