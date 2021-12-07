package v;

import m.Carro;
import m.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo v=new Veiculo();
        Carro c=new Carro();
        
        v.marca="Honda";
        v.modelo="Civic";
        v.placa="abc1234";

        c.capacidade=300;
        c.numPortas=5;

        Object objv=v;

        Object objc=c;

        Veiculo v2=(Veiculo)objv;
        Carro c2=(Carro)objc;

        imprime(v2);
        imprime(c2);

    }
    public static void imprime(Object obj){
        System.out.println(obj);
    }
}
