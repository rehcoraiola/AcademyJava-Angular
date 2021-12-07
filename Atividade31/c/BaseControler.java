package c;

import java.lang.reflect.Array;
import java.rmi.Remote;
import java.util.ArrayList;

public class BaseControler<T> {
    public ArrayList<T> dados;

    public BaseControler(){
        dados=new ArrayList<T>();
    }
    public void create(T o){
        dados.add(o);
    }
    public ArrayList<T> read(){
        return dados;
    }
    public void update(T o){
       if(dados.contains(o)){
            delete(o);
            create(o);
       } 
    }
    public void delete(T o){
        dados.remove(o);
    }
    public void imprime(ArrayList<T> o){
        for (T t : o) {
            System.out.println(t);
        }
    }


}
