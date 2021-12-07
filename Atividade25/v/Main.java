package v;

import m.Computador;
import m.Desktop;
import m.Notebook;

public class Main {
    public static void main(String[] args) {
        Computador c=new Computador();
        Notebook n=new Notebook();
        Desktop d=new Desktop();
        
        c.ram="16GB";
        c.hd="1T";
        c.marca="DELL";
        c.processador="IntelI5";

        
        n.ram="16GB";
        n.hd="1T";
        n.marca="DELL";
        n.processador="IntelI5";
        n.bateria="5horas";
        n.bluetooth=4.2;
        n.wifi="40MB";

        d.ram="16GB";
        d.hd="1T";
        d.marca="DELL";
        d.processador="IntelI5";
        d.gabinete=20;
        d.monitorExterno=true;
        d.fonte="65w";

        Object objC=c;
        Object objN=n;
        Object objD=d;

        Computador c1=(Computador)objC;
        Notebook n1=(Notebook)objN;
        Desktop d1=(Desktop)objD;

        imprime(objC);
        imprime(objN);
        imprime(objD);

    }
    public static void imprime(Object obj){
        System.out.println(obj);
    }
}
