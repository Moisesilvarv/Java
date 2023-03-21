package herancafuncionario;

public class Funcionario {

    public String nome;
    public double salario;

    public Funcionario(String nome, double salario, int codfunc) {
        this.nome = nome;
        this.salario = salario;
        this.codfunc = codfunc;
    }
    public int codfunc;

    public Funcionario() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCodfunc(int codfunc) {
        this.codfunc = codfunc;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getCodfunc() {
        return codfunc;
    }

}
