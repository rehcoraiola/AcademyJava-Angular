import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FilmeService {
  private lista:any[] //PERGUNTAR AQUI

constructor() {
  this.lista=[];
}

salvar(filme:any):void{
  this.lista.push(filme)
}
listar():any[]{
  return this.lista
}
}
