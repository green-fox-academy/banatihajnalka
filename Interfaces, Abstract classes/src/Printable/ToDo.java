package Printable;

public class ToDo implements Printable {
    private String task;
    private String priority;
    private boolean isDone;

    public ToDo() {
    }
    public ToDo(String task, String priority, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
    }

    public String getTask() {
        return task;
    }
    public String getPriority() {
        return priority;
    }
    public boolean isDone() {
        return isDone;
    }


    @Override
    public void printAllFields() {
        System.out.println("Task " + getTask() + " | Priority: " + getPriority() + " | Done: " + isDone());
    }
}
