import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import listaTarefas.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);// para entrada de dados através do terminal
       String tarefa = entrada.nextLine();
        ListaTarefas novaTarefa = new ListaTarefas();
        List<ListaTarefas> novaListaTarefa = new ArrayList<>();
novaTarefa.setTarefa(tarefa);
novaListaTarefa.add(novaTarefa);

System.out.println(novaListaTarefa);



entrada.close();
    }
}
