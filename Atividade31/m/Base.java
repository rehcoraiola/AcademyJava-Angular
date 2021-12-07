package m;

public abstract class Base {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base){
            Base b=(Base)obj;
            if(this.id==b.id)
                return true;
        }
        return false;
    }
    // public boolean equals(Object obj) {
    //     if(obj instanceof Pessoa){
    //         Pessoa outra=(Pessoa)outra;
    //         if(this.nome.equals(outra.nome)&&this.idade==outra.idade);
    //             return true;
    //     }
    //     return false;
    // }
    // @Override
    // public String toString() {
    //     return "ID: "+this.id;
    // }
    public String toString() {
        return Integer.toString(id);
    }
}
