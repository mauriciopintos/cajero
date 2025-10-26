package ar.edu.unahur.obj2.command.comandos;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand> comandos = new ArrayList<>();

    public void agregarComando(ICommand comando) {
        comandos.add(comando);
    }

    public void ejecutar() {
        comandos.forEach(ICommand::ejecutar);
        comandos.clear();
    }
}
