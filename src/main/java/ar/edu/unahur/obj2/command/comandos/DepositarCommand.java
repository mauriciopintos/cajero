package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Cuenta;

public class DepositarCommand implements ICommand {
    private final Cuenta cuenta;
    private Double monto;

    public DepositarCommand(Cuenta cuenta, Double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        cuenta.depositar(monto);
    }

}
