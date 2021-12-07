package m;

public abstract class Base {
    public int id;
    
 
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Prato){
            Base o=(Base)obj;
            if(this.id==o.id)
                return true;
        }
        return false;
    }
    //Relembrar como usa toString com int.
    @Override
    public String toString() {
        return "\nID: "+this.id;
    }
}