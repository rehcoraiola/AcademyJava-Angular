import Conta from "./model/Conta.js";

console.log("Banco")

const c1=new Conta();
c1.agencia=121
c1.numero=444
c1.saldo=888.99

console.log(c1.agencia, c1.numero,c1.saldo)