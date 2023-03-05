package Sprint2_4.db;

import Sprint2_4.models.Tasks;
import java.util.ArrayList;


public class DBManager {
    private static ArrayList<Tasks> tasks = new ArrayList<>();
    static {
        tasks.add(new Tasks(1L, "Create JAVA WEB Application", "create app", "Done", "2023-03-08"));
        tasks.add(new Tasks(2L, "Make a clean home", "clean house", "Done", "2023-03-07"));
        tasks.add(new Tasks(3L, "Do the homework", "do all sprint tasks", "Not done", "2023-03-06"));
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

    public static void addTask(Tasks task) {
        task.setId((long) (tasks.size() + 1));
        tasks.add(task);
    }
    public static ArrayList<Tasks> getAllTasks() {
        return tasks;
    }
    public static void deleteTask(Long id) {
        for (int i = 0; i < tasks.size(); i++) {
            Tasks task = tasks.get(i);
            if (task.getId().equals(id)) {
                tasks.remove(i);
                break;
            }
        }
        for (int i = 0; i < tasks.size(); i++) {
            Tasks task = tasks.get(i);
            if (task.getId() > id) {
                task.setId(task.getId() - 1);
            }
        }
    }

    public static void changeTaskName(Long id, String name) {
        Tasks task = getTasksById(id);
        if (task != null) {
            task.setName(name);
        }
    }
    public static void changeTaskDescription(Long id, String description) {
        Tasks task = getTasksById(id);
        if (task != null) {
            task.setDescription(description);
        }
    }
    public static void changeTaskStatus(Long id, String status) {
        Tasks task = getTasksById(id);
        if (task != null) {
            task.setStatus(status);
        }
    }
    public static void changeTaskDeadline(Long id, String date) {
        Tasks task = getTasksById(id);
        if (task != null) {
            task.setDeadlineDate(date);
        }
    }
}
