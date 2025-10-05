package todo;

public class Task {
    private static int id = 0;
    private int taskId;
    private String name;
    private boolean completed;

    Task(String name) {
        id++;
        this.taskId = id;
        this.name = name;
    }

    @Override
    public String toString() {
        String status = completed ? "✅" : "❌";
        return "ID: " + this.taskId + " | 名前: " + this.name + " | 状態: " + status;
    }

    public int getTaskId() {
        return taskId;
    }
}
