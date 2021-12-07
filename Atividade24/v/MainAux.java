package v;

import m.VeiculoAux;
import m.CarroAux;


public class MainAux {
    public static void main(String[] args) {
        VeiculoAux v=new VeiculoAux();
        CarroAux c=new CarroAux();

        v.setMarca("Honda");
        v.setModelo("Civic");
        v.setPlaca("abc1234");

        c.setMarca("H");
        c.setModelo("Fit");
        c.setPlaca("oau1234");
        c.setCapacidade(289);
        c.setNumPortas(3);

        VeiculoAux vc=c;
        imprime(v);
        imprime(c);
        imprime(vc);

    }
    public static void imprime(Object obj){
        System.out.println(obj);
    }
}
