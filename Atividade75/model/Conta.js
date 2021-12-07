class Conta{
    id
    numero
    agencia
    saldo

    constructor(numero,agencia,saldo, id=null){ //Assim cria um id opcional
        this.id=id
        this.numero=numero
        this.agencia=agencia
        this.saldo=saldo
    }

    // get id(){
    //     return this.id
    // }
    // get numero(){
    //     return this.numero
    // }
    // get agencia(){
    //     return this.agencia
    // }
    // get saldo(){
    //     return this.saldo
    // }
    // set id(id){
    //     this.id=id
    // }
    // set numero(numero){
    //     this.numero=numero
    // }
    // set agencia(agencia){
    //     this.agencia=agencia
    // }
    // set saldo(saldo){
    //     this.saldo=saldo
    // }
    
}
export default Conta