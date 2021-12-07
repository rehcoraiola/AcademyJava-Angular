package m;

public class VeiculoAux {
    private String marca;
    private String modelo;
    private String placa;

    @Override
    public String toString() {
        return "Marca: "+this.marca+"\tModelo: "+this.modelo+"\tPlaca: "+this.placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
}
