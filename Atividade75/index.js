//LEMBRAR - npm install no package.json

import Express from "express";
import bodyParser from "body-parser";
import ContaApi from "./api/ContaApi.js";

const api= Express();
api.use(bodyParser.json());     //Pega o que vem do corpo e converte para JSON
api.listen(2000,()=>console.log('Rodando.....'));
api.use('/api/conta',ContaApi)


//localhost:2000/api/conta      Inicia a rota por aqui






