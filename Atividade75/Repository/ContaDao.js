import ContaTable from "./../db/ContaTable.js"
class ContaDao{

    async findAll(){            //quando usa Retorno, necesssario informar que é async
        const lista= await ContaTable.findAll({raw:true}); //assíncrona
        return lista;
    }
    async create(model){
        return await ContaTable.create(model);
    }
    async update(model){
        return await ContaTable.update(model,{
            where:{id:model.id}
        });
    }
    async delete(id){
        return await ContaTable.destroy({
            where:{id:parseInt(id)}        //where{id:1}
        }); 
    }
}

export default ContaDao

