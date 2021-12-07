public class at16_2 { 
    public static void main(String[] args) {
        double valor=10000.00;
        conta s=new conta();
        s.setSaldo(valor);

        sacar c=new sacar(s);
       
        
        if(c.sacarr(valor)){
            System.out.println("Saque realizado: ");     
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
