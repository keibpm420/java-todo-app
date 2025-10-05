package todo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {
    private List<Task> taskList = new ArrayList<>();

    public void addTask(Task t) {
        taskList.add(t);
        System.out.println("タスクを追加しました\n");
    }

    public void printTask() {
        for (Task t : taskList) {
            System.out.println(t);
        }
        System.out.println();
    }

    public void validateId(int id) {
        Iterator<Task> it = taskList.iterator();
        while (it.hasNext()) {
            if (it.next().getTaskId() == id) {
                it.remove();
            }
        }
        System.out.println("削除後");
        printTask();
    }
}
