package prjbanco;
import java.util.ArrayList;
public class Banco {
    private String nome;
    private String cnpj;

    private ArrayList<Conta> ListaDeConta;
listaDeContas = new Arraylist();

public Banco(){}
public Banco(String nome, String cnpj){
this.nome = nome;
this.cnpj = cnpj;
listaDeContas = new Arraylist();
}



public String getNome() {
    return nome;
}
public void setNome(Sting nome) {
    this.nome = nome;
}




//criarConta(){};
public void criarConta(String numero, int ag){
Conta c1 = new Conta(numero, ag);
listaDeContas.add(c1);
}
public void depositarValorNaConta(Conta conta, float vlr){
for(int i=0); i<listaDeContas.size();i++){
if(listaDeContas.get(i).getNumero().equals(conta.getNumero()))) {
&& listaDeContas.get(i).getAgencia() == conta.getAgencia();
listaDeContas.get(i).depositar(vlr);
  }
 }
public void imprimirDados();
    for(int i = 0; listaDecontas.size();i++)){
system.out.println("Elemento "+ i ": "+ listaDeContas.get(i).getNumero());
system.out.println("Agencia "+ i ": "+ listaDeContas.get(i).getAgencia());
}system.out.println("Saldo "+ i ": "+ listaDeContas.get(i).getSaldo());

public void sacar(Conta conta, float vlr){
    
}}