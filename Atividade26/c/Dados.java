package c;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dados {
    public Object[] dados;
    public int posicaoAtual;
    
    

    public Dados(){
        dados=new Object[3];        //trocar para 5
    }
    public String add(Object obj){
        verificaTamanho();
        dados[posicaoAtual]=obj;
        posicaoAtual++;
        return "Add";
    }
    private void verificaTamanho(){
        if(dados.length<=posicaoAtual){
            Object[] dados2=new Object[dados.length+5];
            for (int i = 0; i < dados.length; i++) {
                dados2[i]=dados[i];
            }
            dados=dados2;
        }
    }
    private int size(){
        return posicaoAtual;
    }
    public void remove(Object obj){
        for (int i = 0; i < posicaoAtual; i++) {
            if(dados[i].equals(obj))
            corrigeArray(i);
        }
        //posicaoAtual--;
      
    }
    private void corrigeArray(int posicao){
        for (int i = posicao; i < size(); i++) {
            dados[i]=dados[i+1];
        }
        posicaoAtual--;
    }
    public String objSalvo(Object obj){
        for (int i = 0; i < posicaoAtual; i++) {
            if(dados[i].equals(obj))
            return "true";
        }
         return "false";
    }
    public void imprimirArray(){
        for (int i = 0; i < size(); i++) {
            System.out.println(dados[i].toString());
        }
    }
}
