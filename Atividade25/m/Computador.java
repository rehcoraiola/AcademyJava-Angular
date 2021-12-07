package m;

public class Computador {
    public String marca;
    public String ram;
    public String processador;
    public String hd;
   
    @Override
    public String toString() {
        return "Marca: "+this.marca+"\tRam: "+this.ram+"\tProcessador: "+this.processador+"\tHD: "+this.hd;
    }
    
}