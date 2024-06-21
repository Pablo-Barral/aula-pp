package org.example;

import java.util.ArrayList;
import java.util.List;

public class Guarda {

    private List<Command> commands = new ArrayList<Command>();

    public void executarComando(Command command) {
        this.commands.add(command);
        command.executar();
    }

}
