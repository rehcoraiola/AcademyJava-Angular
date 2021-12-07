package c;

import java.util.ArrayList;

public abstract class BaseController<T>{
    public ArrayList<T> dados;

    public BaseController(){
        dados=new ArrayList<T>();
    }

    public void create(T o){
        dados.add(o);
    }
    public ArrayList<T> read(){
        return this.dados;
    }
    public void delete(T o){
        dados.remove(o);
    }
    public void update(T o){
        if(dados.contains(o)){
            delete(o);
            create(o);
        }
    }
}
