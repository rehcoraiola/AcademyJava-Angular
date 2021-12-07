import {Pessoa} from "./Pesssoa.js"

export class PessoaFisica extends Pessoa{
    cpf;

    constructor(cpf){
        super()
        this.cpf=cpf
    }
}