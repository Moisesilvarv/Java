package testapessoa;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Zé", 1.75F, 80);

        System.out.println("Nome da pessoa: " + p1.getNome());
        System.out.println("Altura da pessoa: " + p1.getAltura());
        System.out.println("Peso da pessoa: " + p1.getPeso());
        
        Funcionario f1 = new Funcionario(1000, 3500, "Desenvolveddor JR");
        p1.setNome("Beto");
        p1.setAltura(1.65);
        p1.setPeso(75);
        
        System.out.println("-------------------------------------");
        
        System.out.println("Nome do Funcionario: " + p1.getNome());
        System.out.println("Altura do Funcionario: " + p1.getAltura());
        System.out.println("Peso do Funcionario: " + p1.getPeso());
        System.out.println("Matricula do Funcionario: " + f1.getMatricula());
        System.out.println("Cargo do Funcionario: " + f1.getCargo());
        System.out.println("Salario do Funcionario: " + f1.getSalario());
    }
}
