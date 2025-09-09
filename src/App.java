import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;

import listaTarefas.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);// para entrada de dados através do terminal
        List<ListaTarefas> novaListaTarefa = new ArrayList<>(); // Um arraylist por ser dinamico para cria lista de tarefas
        FileWriter escrever = new FileWriter("MEU Arquivo");
        escrever.write("Escrever textoes");

            for(int i=0;i<=5;i++){
ListaTarefas novaTarefa = new ListaTarefas();  //Crio o objeto nova tarefa, da classe Lista tarefa
String tarefas = entrada.nextLine();
novaTarefa.setTarefa(tarefas);
novaListaTarefa.add(novaTarefa);
System.out.println(novaListaTarefa);
escrever.write(novaTarefa.getTarefa());
        }
escrever.write("-------------");
//Fechamento de Scanner e FilerWriter.
escrever.close();
entrada.close();
    }
}
