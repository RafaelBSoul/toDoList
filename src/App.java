import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;

import listaTarefas.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);// para entrada de dados através do terminal
       String tarefa = entrada.nextLine();// Crio uma variavel string para receber "entrada" do Scanner
        ListaTarefas novaTarefa;  //Crio o objeto nova tarefa, da classe Lista tarefa

        List<ListaTarefas> novaListaTarefa = new ArrayList<>(); // Um arraylist por ser dinamico para cria lista de tarefas
        FileWriter escrever = new FileWriter("MEU Arquivo");
        escrever.write("Escrever textoes");

                        tarefa = entrada.nextLine();// Crio uma variavel string para receber "entrada" do Scanner

        novaTarefa.setTarefa(tarefa);
novaListaTarefa.add(novaTarefa);

System.out.println(novaListaTarefa);
escrever.write(tarefa);

escrever.close();
entrada.close();
    }
}
