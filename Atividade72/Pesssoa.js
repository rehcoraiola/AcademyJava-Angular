export class Pessoa{
    #nome; //# - Privado        _ - Protect
    #idade;
    #rg;

    get nome(){
        return this.#nome
    }
    get idade(){
        return this.#idade
    }
    get rg(){
        return this.#rg
    }
    set nome(nome){
        this.#nome=nome
    }
    set idade(idade){
        this.#idade=idade
    }
    set rg(rg){
        this.#rg=rg
    }

}