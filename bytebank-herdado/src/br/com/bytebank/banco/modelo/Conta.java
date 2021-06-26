package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 *
 * @author Fernando Satoshi Akamine
 */

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("o total de contas é: " + bytebank.banco.modelo.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior do que o saldo.
     *
     * @param valor
     * @throws SaldoInsificienteException
     */
    public void saca(double valor) throws SaldoInsificienteException{
        if(this.saldo < valor) {
            throw new SaldoInsificienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsificienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }
}