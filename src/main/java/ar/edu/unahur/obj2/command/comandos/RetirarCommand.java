package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.Cuenta;

public class RetirarCommand implements ICommand {
    private final Cuenta cuenta;
    private Double monto;

    public RetirarCommand(Cuenta cuenta, Double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void ejecutar() {
        cuenta.retirar(monto);
    }

}
