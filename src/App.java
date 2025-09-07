import java.util.ArrayList;
import java.util.List;

import listaTarefas.ListaTarefas;

public class App {
    public static void main(String[] args) throws Exception {
   List<ListaTarefas> tarefas= new ArrayList<>();
   tarefas.add(new ListaTarefas("nob"));

   for (ListaTarefas tarefa : tarefas) {
       System.out.println(tarefa.getNome());
   }
    }
}
