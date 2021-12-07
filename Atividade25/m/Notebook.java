package m;
import m.Computador;

public class Notebook extends Computador{
    public String bateria;
    public String wifi;
    public double bluetooth;

    @Override
    public String toString() {
        return super.toString()+"\tBateria: "+this.bateria+"\t Velocidade WIFI: "+this.wifi+"\tVersão Bluetooth: "+this.bluetooth;
    }
}
