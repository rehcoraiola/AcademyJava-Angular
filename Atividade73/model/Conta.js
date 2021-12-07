class Conta{
    #numero
    #agencia
    #saldo

    get numero(){
        return this.#numero
    }
    get agencia(){
        return this.#agencia
    }
    get saldo(){
        return this.#saldo
    }
    set numero(numero){
        this.#numero=numero
    }
    set agencia(agencia){
        this.#agencia=agencia
    }
    set saldo(saldo){
        this.#saldo=saldo
    }
    
}
export default Conta