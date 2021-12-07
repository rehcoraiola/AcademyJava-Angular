package m;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public String toString() {
        return "Nome: "+this.nome+this.sobrenome+"\nIdade: "+this.idade;
    }
    @Override
    public boolean equals(Object obj) {
        Pessoa pObj=(Pessoa)obj;
        if(this.nome.equals(pObj.nome) && this.sobrenome.equals(pObj.sobrenome) && this.idade==pObj.idade)
            return true;
        return false;
    }
    public boolean equalsCorreto(Object obj){   
        if(obj instanceof Pessoa){      //IMPORTANTE (obj aceita tudo)
            Pessoa pObj=(Pessoa)obj;
            if(this.nome.equals(pObj.nome) && this.sobrenome.equals(pObj.sobrenome) && this.idade==pObj.idade)
                return true;
        }
        return false;
    }
}