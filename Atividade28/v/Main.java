package v;

import c.BaseControler;
import m.Endereco;
import m.PessoaFisica;
import m.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf1=new PessoaFisica();
        PessoaFisica pf2=new PessoaFisica();
        PessoaJuridica pj1=new PessoaJuridica();
        PessoaJuridica pj2=new PessoaJuridica();
        BaseControler b=new BaseControler<>();

        Endereco e=new Endereco();
        e.rua="rua maria";
        e.numero="123";

        pf1.id=1;
        pf1.cpf="456789";
        pf1.endPF=e;

        pf2.id=2;
        pf2.cpf="765689";
        pf2.endPF=e;
    
        b.create(pf1);
        b.update(pf2);
        b.delete(pf1);
        b.create(pf2);
        b.imprime();
        
        e=new Endereco();
        e.rua="rua Renata";
        e.numero="876";

        pj1.id=1;
        pj1.cnpf="456789";
        pj1.endPJ=e;

        pj2.id=2;
        pj2.cnpf="765689";
        pj2.endPJ=e;

        b.create(pj1);
        b.update(pj2);
        b.delete(pj1);
        b.create(pj2);
        b.imprime();
        
    }
}
