package v;

import c.FilmeControler;
import c.SerieControler;
import m.Filme;
import m.Serie;

public class Main {
    public static void main(String[] args) {
        Filme f1=new Filme();
        Filme f2=new Filme();
        Serie s1=new Serie();
        Serie s2=new Serie();

        f1.id=1;
        f1.tempo=230; 
        f2.id=2;
        f2.tempo=140; 

        s1.id=1;
        s1.temporada=2; 
        s2.id=2;
        s2.temporada=8; 
        System.out.println("--------------Create/Read-----------");
        FilmeControler fc=new FilmeControler();
        SerieControler sc=new SerieControler();
        fc.create(f1);
        fc.create(f2);
        sc.create(s1);
        sc.create(s2);

        fc.imprime(fc.read());
        sc.imprime(sc.read());
        
        System.out.println("--------------Update-----------");
        Filme f3=new Filme();
        f3.id=1;
        f3.tempo=20;
        fc.update(f3);
        fc.imprime(fc.read());
       
        Serie s3=new Serie();
        s3.id=2;
        s3.temporada=9; 
        sc.update(s3);
        sc.imprime(sc.read());

        System.out.println("--------------Delete-----------");
        fc.delete(f2);
        sc.delete(s2);
        fc.imprime(fc.read());
        sc.imprime(sc.read());

    }
}
