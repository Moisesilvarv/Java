package USCS;

public class TestaPessoa {


    public static void main(String[] args) {
       Pessoa p1 = new Pessoa () ; 
       p1.setNome  ("Moises");
       p1.setIdade (19);
       p1.setEmail ("harmoisah@gmail.com");
       
       p1.Imprime();
       
       
       Pessoa p2 = new Pessoa () ;
       p2.setNome  ("Lucas");
       p2.setIdade  (22);
       p2.setEmail  ("lucasluna@gmail.com");
       
       p2.Imprime();
       
    }
    
}