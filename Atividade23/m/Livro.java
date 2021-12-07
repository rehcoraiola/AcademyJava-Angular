package m;
    public class Livro extends Base{
        private String nome;
        private String autor;

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
        public String getAutor() {
            return autor;
        }
        public String getNome() {
            return nome;
        }
        @Override
        public boolean equals(Object obj) {
            Livro livroAux=(Livro)obj;
            if(livroAux.getId()==this.getId())
                return true;
            return false;
        }
        @Override
        public String toString() {
            return "ID: "+this.getId()+"Nome: "+this.getNome()+"\nAutor: "+this.getAutor();
        }
    }
        
    
        
        
 