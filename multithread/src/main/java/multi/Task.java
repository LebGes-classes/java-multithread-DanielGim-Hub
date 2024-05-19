package multi;

public class Task {
    public String name; // название задачи
    public int idWorker; // номер работника(кто исполняет задачу)
    public int hours;
    public boolean status;
    public static final String TITLE_OF_TASK_TABLE = "tasks.xlsx";
    public int getHours() {
        return hours;
    }
    public String getName() {
        return name;
    }
    public void complete() {
        status = false;
    }

    public Task(String name, int time) {
        this.hours = time;
        this.status = true;
        this.name = name;
    }
}