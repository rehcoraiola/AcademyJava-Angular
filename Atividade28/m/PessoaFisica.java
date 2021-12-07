package m;

public class PessoaFisica extends Base{
    public String cpf;
    public Endereco endPF;
    
    @Override
    public String toString() {
        return super.toString()+"CPF: "+this.cpf;
    }
}