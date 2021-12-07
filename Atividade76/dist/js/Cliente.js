export class Cliente {
    constructor(id, nome) {
        this._id = id;
        this._nome = nome;
    }
    get id() {
        return this.id;
    }
    set id(v) {
        this.id = v;
    }
    get nome() {
        return this.nome;
    }
    set nome(v) {
        this.nome = v;
    }
}
