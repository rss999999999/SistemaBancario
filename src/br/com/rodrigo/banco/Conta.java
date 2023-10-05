/**
 * Modificadores de acesso:
 * <p>
 * public: todos podem acessar
 * private: somente a própria classe pode acessar
 * protected: somente a própria classe e as classes filhas podem acessar
 * default (package): somente as classes do mesmo pacote podem acessar
 * static: o atributo ou método pertence à classe e não ao objeto
 * final: o atributo ou método não pode ser alterado
 * abstract: a classe não pode ser instanciada
 */

package br.com.rodrigo.banco;

public class Conta {

    protected int agencia;
    int numero;
    double saldo;

    //construtor padrão
    public Conta() {

    }

    //construtor de classe (com parâmetros
    //alt + insert
    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    //método (sem retorno - void)
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void retirar(double valor) {
        this.saldo -= valor;
    }

    public double verificarSaldo() {
        return this.saldo;
    }


}



