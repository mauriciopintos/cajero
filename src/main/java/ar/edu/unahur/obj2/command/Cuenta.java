package ar.edu.unahur.obj2.command;

public class Cuenta {
    private final Integer numero;
    private Double saldo;

    public Cuenta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double monto) {
        saldo += monto;
    }

    public void retirar(Double monto) {
        saldo -= monto;
    }
}
