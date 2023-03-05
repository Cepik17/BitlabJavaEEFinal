package Sprint2_4.db;

import Sprint2_4.models.Tasks;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static Long id =4L;

    private static ArrayList<Tasks> tasks = new ArrayList<>();

    static {
        tasks.add(new Tasks(1L, "Create JAVA WEB Application", "create app", "Done","08.03.2022"));
        tasks.add(new Tasks(2L, "Make a clean home", "clean house", "Done", "07.03.2022"));
        tasks.add(new Tasks(3L, "Do the homework", "do all sprint tasks", "Not done", "06.03.2022"));
    }
    public static ArrayList<Tasks> getTasks() {
        return tasks;
    }
    public static Tasks getTasksById(Long id) {
        for (Tasks task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }
    public static void addTask(Tasks task){
        task.setId(id);
        tasks.add(task);
        id++;
    }

    public static ArrayList<Tasks> getAllTasks(){
        return tasks;
    }
    public static void deleteTask(Long id){
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
