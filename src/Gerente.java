public class Gerente extends Empregado {

   private String departamento;
   public Gerente(String nome, float salario, String departamento ){ 

    setNome(nome);
    this.salario = salario;
    this.departamento = departamento;
    
   }

public String getDepartamento() {
    return departamento;
}

public void setDepartamento(String departamento) {
    this.departamento = departamento;
}
    
 @Override
 public String toString() {
     return super.toString() + " \nDepartamento: " + departamento;
 
    }
}
