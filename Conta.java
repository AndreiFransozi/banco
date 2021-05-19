/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Conta {
    private String número;
    private int agencia;
    private float saldo;


    public Conta(){}
    
    public Conta(String numero, int agencia){}
    this.agencia = agencia;
    this.numero = numero;

    public String getNúmero() {
        return número;
    }

    public int getAgencia() {
        return agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

public void depositar(float valor){
    this.saldo = this.saldo += valor;
}
public void sacar (float valor) {
if(valor <= saldo)
    this.saldo -= valor;
}
}


public float consultarSaldo(){
    retur this.getSaldo();
}
}
public void imprimirDadosConta(){

system.out.println("Número:" this getNumero());
system.out.println("Saldo:" this getSaldo());
system.out.println("agencia:" this getAgencia());
system.out.println("------------------------------");    