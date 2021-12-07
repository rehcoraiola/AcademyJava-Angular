package m;

 public class CarroAux extends VeiculoAux{
    private int numPortas;
    private int capacidade;
    
    
    public String toString() {
        return super.toString()+"\tNumero de Portas: "+this.numPortas+"\tCapacidade Porta-malas: "+this.capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public int getNumPortas() {
        return numPortas;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
