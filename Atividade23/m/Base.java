package m;

import java.util.Random;
import java.util.UUID;

public class Base {
    private UUID id;

    public Base(){
        this.id=UUID.randomUUID();
    }
    public String getId() {
        return id.toString();
    }
}
