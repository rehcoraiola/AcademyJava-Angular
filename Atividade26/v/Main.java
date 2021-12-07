package v;

import c.Dados;
import m.Aluno;
import m.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p=new Pessoa();
        Aluno a=new Aluno();

        p.nome="Renata";
        p.sobrenome="Coraiola";
        p.idade=28;

        a.nome="Re";
        a.sobrenome="Coraiola";
        a.idade=28;
        a.matricula=124567;
        a.curso="Análise e desenvolvimento de sistemas";
        a.turma="3B";

        Dados d=new Dados();
        d.add(p);
        d.add(a);
        d.imprimirArray();

        System.out.println("---------------Contains------------------");
        Pessoa p1=p;
        System.out.println(d.objSalvo(p1));

        d.remove(a);
        System.out.println("---------------Deletando------------------");
        d.imprimirArray();
    }
}
