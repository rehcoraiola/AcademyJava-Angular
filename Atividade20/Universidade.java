public class Universidade {
    public static void main(String[] args) {
        Funcionario f=new Funcionario();
        Coordenador c=new Coordenador();
        Aluno a=new Aluno();

        f.setNome("Renata");
        f.setSobrenome("Coraiola");
        f.setMatricula(125387);
        f.setDepartamento("SCAP");
        f.setSalario(2000.00);
       

        c.setNome("Gabriel");
        c.setSobrenome("Coraiola");
        c.setMatricula(579);
        c.setSalario(1000.00);
        c.setDepartamento("GDCS");
        c.setBonus(200.00);
        c.setCursoCordenado("Análise e desenvolvimento de sistemas");

        a.setNome("Lynconl");
        a.setSobrenome("Coraiola");
        a.setMatricula(45678);
        a.setCurso("Análise e desenvolvimento de sistemas");
        a.setTurma(467);

        System.out.printf("Nome: %s %s \n Matricula: %d \n Departamento: %s \n Salario: %.2f \n\n\n",f.getNome(),f.getSobrenome(),f.getMatricula(),f.getDepartamento(),f.getSalario());
        System.out.printf("Nome: %s %s \n Matricula: %d \n Departamento: %s \n Salario: %.2f \n Bonus: %.2f \n Curso: %s \n\n\n",c.getNome(),c.getSobrenome(),c.getMatricula(),c.getDepartamento(),c.getSalario(),c.getBonus(),c.getCursoCordenado());
        System.out.printf("Nome: %s %s \n Matricula: %d \n Curso: %s \n Turma: %d \n\n\n",a.getNome(),a.getSobrenome(),a.getMatricula(),a.getCurso(),a.getTurma());
    }
}
