package pl.edu.uwm.obiektowe.lab12;

public class Test_1 {
    public static void main(String[] args) throws Exception {
        ListOfTask_1 toDo = new ListOfTask_1();
        toDo.commands();
        System.out.println(toDo.list_of_tasks_priority);
        toDo.commands();
        System.out.println(toDo.list_of_tasks_priority);
    }
}
