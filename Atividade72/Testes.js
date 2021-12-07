import {PessoaFisica} from "./PessoaFisica.js"
import {PessoaJuridica} from "./PessoaJuridica.js"

const pf=new PessoaFisica("45678909")
pf.nome="Renata";
pf.idade="28";
pf.rg="532687981";


const pj=new PessoaJuridica("3546780001/08")
pj.nome="Re";
pj.idade="30";
pj.rg="60000996";

console.log(pf);
console.log(pj);

//Para imprimir valores PRIVADOS eles devem ser chamados separadamente
console.log(pj.rg);