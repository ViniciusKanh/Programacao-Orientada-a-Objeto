/******************************************************************************

4. Elabore uma classe ContaBancaria, com os seguintes membros:
 Atributo String cliente;
 Atributo int num_conta;
 Atributo float saldo;
 Método sacar (o saldo não pode ficar negativo);
 Método depositar
Agora acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupanca e ContaEspecial, as seguintes características a mais:
 Classe ContaPoupanca
 Atributo int diaDeRendimento
 Classe ContaPoupanca
 Atributo int diaDeRendimento
 Método calcularNovoSaldo, recebe a taxa de rendimento da poupança e atualiza o saldo
 Classe ContaEspecial
 Atributo float limite
 Redefinição do método sacar, permitindo saldo negativo até o valor do limite.
Após a implementação das classes acima, você deverá implementar uma classe ContasJava, contendo o método main. Nesta classe, você deverá implementar:
 Incluir dados relativos a(s) conta(s) de um cliente;  Depois, apresentar as seguintes opções no menu:
 Sacar um determinado valor da(s) sua(s) conta(s);
 Depositar um determinado valor na(s) sua(s) conta(s);
 Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança;
 Mostrar os dados da(s) conta(s) de um cliente.
*******************************************************************************/
public class ContaPoupanca extends ContaBancaria {
  
  private int diaDeRendimento;
  private float saldo;
  
    public float getSaldo(){
    return saldo;
  }
  public void setSaldo(float saldo){
    this.saldo=saldo;
  
  }
  
  
  public int getDiaDeRendimento(){
    return diaDeRendimento;
  }
  public void setDiaDeRedimento( int diaDeRendimento){
    this.diaDeRendimento=diaDeRendimento;
  }
  
    public void calcularNovoSaldo(int diaDeRendimento){
    
   this.saldo = this.saldo + (this.saldo*diaDeRendimento)/100;
    
  }
  
}