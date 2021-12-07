package m;

public class PessoaJuridica extends Base{
    public String cnpf;
    public Endereco endPJ;

    @Override
    public String toString() {
        return super.toString()+"CNPF: "+this.cnpf;
    }
}
