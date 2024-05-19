import multi.Task;
import multi.Worker;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class test {


    // Тест для правильного добавления задачи к работнику
    @Test
    void testAddTask() {
        Worker worker = new Worker("Джон", 1, 0, 0, 0); // Создание экземпляра работника
        Task task = new Task("Задача 1", 8);
        worker.addTask(task);
        List<Task> tasks = worker.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Задача 1", tasks.get(0).getName());
        assertEquals(8, tasks.get(0).getHours());
    }

    //  Тест для проверки корректности выполнения задачи работником
    @Test
    void testRun() {
        Worker worker = new Worker("Джон", 1, 1, 1, 0);
        Task task1 = new Task("Задача 1", 8);
        Task task2 = new Task("Задача 2", 4);
        worker.addTask(task1);
        worker.addTask(task2);
        worker.run();
    }

    // Тест для проверки инициализации задачи с правильными параметрами
    @Test
    void testTaskInitialization() {
        Task task = new Task("Задача 1", 8);

        assertEquals("Задача 1", task.getName());
        assertEquals(8, task.getHours());
        assertTrue(task.status);
    }

    // Тест для проверки завершения задачи
    @Test
    void testCompleteTask() {
        Task task = new Task("Задача 1", 8);
        task.complete();

        assertFalse(task.status);
    }
}
