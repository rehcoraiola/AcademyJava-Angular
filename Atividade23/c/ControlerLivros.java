package c;

import java.lang.reflect.Array;
import java.util.ArrayList;
import m.Livro;

public class ControlerLivros {
    private ArrayList<Livro> livros;

    public ControlerLivros(){
        livros=new ArrayList<Livro>();
    }

    public void create(Livro l){
        livros.add(l);
    }
    public ArrayList<Livro> read(){
        return livros;
    }
    public void delete(Livro l){
        livros.remove(l);
    }
    public void update(Livro l){
        if(livros.contains(l)){
            livros.remove(l);
            livros.add(l);
        }
    }
}
