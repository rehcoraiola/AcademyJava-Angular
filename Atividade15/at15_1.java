package at15;

public class at15_1 {
    public static void main(String[] args) {
        pessoa p1=new pessoa();
        pessoa p2=new pessoa();

        p1.nome="Renata";
        p1.sobrenome="Coraiola";
        p1.idade=28;

        p2.nome="Gabriel";
        p2.sobrenome="Coraiola";
        p2.idade=23;

        imprime(p1);
        imprime(p2);
    }
    static void imprime(pessoa p){
        System.out.printf("Nome: %s %s, idade: %d \n",p.nome,p.sobrenome,p.idade);
    }
}
