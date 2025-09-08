import java.util.ArrayList;
import java.util.List;

import listaTarefas.*;

public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas novatarefa = new ListaTarefas();
        List<ListaTarefas>noTa = new ArrayList<>();
        novatarefa.setTarefa("coco");
        noTa.add(novatarefa);
        

System.out.println(novatarefa);
System.out.println(noTa);

    }
}
