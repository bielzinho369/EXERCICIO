public class Vendedor extends Empregado {
   
    private float percentualComissao;
    public float calcularSalario(){
       
    return this.salario + (this.salario * percentualComissao / 100); 
   }

    public Vendedor(String nome, float salario, float percentualComissao ){

    setNome(nome);
    this.salario = salario;
    this.percentualComissao = percentualComissao;

    }

    @Override
    public String toString() {
    
        return super.toString () + "Salario com comissão: " + calcularSalario() + " \npercentual de Comissao: " + percentualComissao;
    }
}
