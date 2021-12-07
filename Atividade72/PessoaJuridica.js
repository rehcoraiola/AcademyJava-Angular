import {Pessoa} from "./Pesssoa.js"

export class PessoaJuridica extends Pessoa{
    cnpj;

    constructor(cnpj){
        super()
        this.cnpj=cnpj
    }
}