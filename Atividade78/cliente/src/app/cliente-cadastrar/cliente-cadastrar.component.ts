import { FilmeService } from './../service/filme.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cliente-cadastrar',
  templateUrl: './cliente-cadastrar.component.html',
  styleUrls: ['./cliente-cadastrar.component.css']
})
export class ClienteCadastrarComponent implements OnInit {
  id:number=0;
  nome:string="";

  constructor(private FilmeService:FilmeService) {

  }

  ngOnInit(): void {
  }

  salvar(){
    let filme= {   //JSON
      "id":this.id,
      "nome":this.nome
    };

    this.FilmeService.salvar(filme);
    this.limpar();
  }

  private limpar(){
    this.id=0;
    this.nome="";
  }
}
