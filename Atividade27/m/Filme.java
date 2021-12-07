package m;

public class Filme extends Base {
    public int tempo;
    
    @Override
    public String toString() {
        return super.toString()+" "+this.tempo;
    }
}