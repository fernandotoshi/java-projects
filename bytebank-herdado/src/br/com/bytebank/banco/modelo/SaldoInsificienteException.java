package br.com.bytebank.banco.modelo;

public class SaldoInsificienteException extends Exception{

    public SaldoInsificienteException(String msg) {
        super(msg);
    }
}
