package ar.edu.unahur.obj2.command;

import ar.edu.unahur.obj2.command.comandos.DepositarCommand;
import ar.edu.unahur.obj2.command.comandos.ICommand;
import ar.edu.unahur.obj2.command.comandos.Invoker;
import ar.edu.unahur.obj2.command.comandos.RetirarCommand;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1234, 10000.0);
        ICommand deposito1 = new DepositarCommand(cuenta, 3000.0);
        ICommand deposito2 = new DepositarCommand(cuenta, 500.0);
        ICommand retiro = new RetirarCommand(cuenta, 5000.0);

        Invoker invoker = new Invoker();

        invoker.agregarComando(retiro);

        invoker.ejecutar();
        System.out.println("SALDO: " + cuenta.getSaldo());
        invoker.agregarComando(deposito1);

        invoker.ejecutar();
        System.out.println("SALDO: " + cuenta.getSaldo());
        invoker.agregarComando(deposito2);

        invoker.ejecutar();
        System.out.println("SALDO: " + cuenta.getSaldo());
    }
}