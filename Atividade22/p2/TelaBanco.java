package p2;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc=new ContaCorrente(2000.00, 123);

        System.out.println(cc);
        cc.saque(20.00);
        System.out.println(cc);
        cc.deposita(10.00);
        System.out.println(cc);
    }
}
