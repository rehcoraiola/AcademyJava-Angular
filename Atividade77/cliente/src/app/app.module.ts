import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClienteListarComponent } from './cliente-listar/cliente-listar.component';
import { ClienteCadastrarComponent } from './cliente-cadastrar/cliente-cadastrar.component';

@NgModule({
  declarations: [
    AppComponent,
    ClienteListarComponent,
    ClienteCadastrarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
