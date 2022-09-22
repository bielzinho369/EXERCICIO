import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
    
      System.out.println("Digite o seu nome: ");
       String nome = sc.next();

      System.out.println("Digite o seu salário: "); 
      float salario = sc.nextFloat();

       Empregado empregado = new Empregado();
        empregado.setNome(nome);
        empregado.setSalario(salario);

        System.out.println(empregado.toString());
        
        System.out.println("Digite o seu nome: ");
            nome = sc.next();

        System.out.println("Digite o seu salário: "); 
           salario = sc.nextFloat();
    
        System.out.println("Digite o Departamento: ");
         String departamento = sc.next();
         
         Gerente gerente = new Gerente(nome, salario, departamento);

         System.out.println(gerente.toString());
        
    
    
    
    
    
     sc.close();
    }
}
