
package br.com.rodrigo.banco;

public class Teste {
    public static void main(String[] args) {

        //Conta Corrente
        Conta cc = new Conta(123, 456, 1000.0);
        cc.depositar(100.0);
        cc.retirar(50.0);
        System.out.println("Saldo: " + cc.verificarSaldo());

        //Conta Poupança
        Conta cp = new Conta(123, 789, 1000.0);
        cp.depositar(100.0);
        cp.retirar(50.0);
        System.out.println("Saldo: " + cp.verificarSaldo());
    }
}
