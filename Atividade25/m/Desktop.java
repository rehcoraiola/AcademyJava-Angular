package m;
import m.Computador;

public class Desktop extends Computador{
    public int gabinete;
    public boolean monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        return super.toString()+"\tTamanho Gabinete: "+this.gabinete+"\tMonitor Externo: "+this.monitorExterno+"\tFonte: "+this.fonte;
    }

}
