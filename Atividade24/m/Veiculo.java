package m;


public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return "Marca: "+this.marca+"\tModelo: "+this.modelo+"\tPlaca: "+this.placa;
    }
    
}