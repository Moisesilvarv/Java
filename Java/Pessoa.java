package USCS;


public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
   public void setEmail (String email)
   {
       this.email = email;
   }

    public void setIdade(int idade) {
        this.idade = idade;
    }
   
   
   
   public void Imprime ()
   {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(email);
   }
   
   
}
