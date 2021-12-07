package m;

public abstract class Base {
    public int id;

    public boolean equals(Object obj) {
        Base b=(Base)obj;
        if(this.id==b.id)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "ID: "+this.id+"\t";
    }
}
