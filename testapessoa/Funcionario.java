package testapessoa;

public class Funcionario {

    private int matricula;
    private int salario;
    private String cargo;

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getSalario(){
        return this.salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    Funcionario (){
        
    }
    Funcionario (int matricula){
        this.matricula = matricula;
    }
    Funcionario (int matricula, int salario){
        this.matricula = matricula;
        this.salario = salario;
    }
    Funcionario (int matricula, int salario, String cargo){
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

}
