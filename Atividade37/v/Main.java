package v;

import java.io.FileOutputStream;

import c.PratoController;
import m.Prato;

public class Main {
    public static void main(String[] args) {
        Prato p1=new Prato();
        Prato p2=new Prato();
        Prato p3=new Prato();
        PratoController pc1=new PratoController();

        p1.id=1;
        p1.proteina="Frango";
        p1.valor=20.00;

        p2.id=2;
        p2.proteina="Frango";
        p2.valor=10.00;

        p3.id=2;
        p3.proteina="Carne";
        p3.valor=50.00;

        pc1.create(p1);
        System.out.println(pc1.read());
        pc1.create(p2);
        System.out.println(pc1.read());
        pc1.update(p3);
        System.out.println(pc1.read());
        pc1.delete(p1);
        System.out.println(pc1.read());
        

    }
}
