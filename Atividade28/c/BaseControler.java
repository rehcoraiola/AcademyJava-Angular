package c;

import java.lang.reflect.Array;
import java.util.ArrayList;

import m.Base;

public class BaseControler<T> {
    private ArrayList<T> dados;

    public BaseControler(){
        dados=new ArrayList<T>();
    }
    public void create(T o){
        dados.add(o);
    }
    public ArrayList read(){
        return this.dados;
    }
    public void update(T o){
        if(dados.contains(o)){
            delete(o);
            delete(o);
        }
    }
    public void delete(T o){
        dados.remove(o);
    }
    public void imprime(){
        for (T t : dados) {
            System.out.println(t);
        }
    }
}
