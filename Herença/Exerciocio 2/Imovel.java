/******************************************************************************

Crie a classe Imovel, que possui um endereço e um preço.
 crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso e impressão deste valor adicional.
 crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de acesso e impressão para este desconto.
 Crie 2 objetos: um da classe Novo e do outro Velho. Entre com o endereço e o preço de cada um, com o adicional ou o desconto e apresente o valor final de cada um.

*******************************************************************************/
public class Imovel {
  
  private String endereco;
  private double preco;
  
  
  public String getendereco(){
    
    return endereco;
    
  }
  
  public void setendereco (String endereco) {
    
    this.endereco=endereco;
    
  }
  
  public double getpreco(){
    return preco;
  }
  
  public void setpreco(double preco){
    
    this.preco = preco;
    
    
  }
  
  public double getadicionalpreco(){
    
    return this.preco*0.50;
    
    
  }
  
  
  public double getdescontapreco(){
    
    return this.preco*0.30;
    
    
  }
}
  
  
