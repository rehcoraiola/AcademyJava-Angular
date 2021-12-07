import { FilmeService } from './../service/filme.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cliente-listar',
  templateUrl: './cliente-listar.component.html',
  styleUrls: ['./cliente-listar.component.css']
})
export class ClienteListarComponent implements OnInit {
  lista:any[]

  constructor(private FilmeService:FilmeService) {
    this.lista=[];
    this.listar();
   }

  ngOnInit(): void {
  }

  private listar(){
    this.lista=this.FilmeService.listar();
  }

}
