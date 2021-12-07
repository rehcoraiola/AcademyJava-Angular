import Database from "./Database.js";
import ContaTable from "./ContaTable.js";

Database
    .sync() 
    .then(()=> console.log('Sincronizado'))
    .catch(()=>console.log('Deu erro'));