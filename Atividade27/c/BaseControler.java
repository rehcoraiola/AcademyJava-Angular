package c;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BaseControler<T> {
    ArrayList<T> dados;

    public BaseControler(){
        dados=new ArrayList<T>();
    }
    public void create(T o){
        dados.add(o);
    }
    public ArrayList<T> read(){
        return this.dados;
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
        for (T t : dados) {
            System.out.println(t);
        }
    }
}
