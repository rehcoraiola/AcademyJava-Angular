package m;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Base {
    public int id;

    public boolean equals(Object obj) {
        //if(obj instanceof Base)       dupla verificação
        Base b=(Base)obj;
        if(this.id==b.id)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "ID: "+this.id;
    }
}
