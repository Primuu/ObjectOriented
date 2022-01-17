package pl.edu.uwm.obiektowe.lab12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ListOfTask_1 {
    public PriorityQueue<Task> list_of_tasks_priority;

    public ListOfTask_1() {
        this.list_of_tasks_priority = new PriorityQueue<Task>(10, Comparator.naturalOrder());
    }

    public void commands() throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("dodaj priorytet opis - dodanie zadania do zrobienia");
        System.out.println("nastepne - usuniecie najbardziej pilnego zadania");
        System.out.println("zakoncz - wyjcie z programu");

        while (true)
        {
            String line = "";
            line = scan.nextLine();
            if (line.startsWith("dodaj"))
            {
                short priority = (short) line.charAt(6);
                priority = (short) (priority - 48);
                Task taskToAdd = new Task(priority, line.substring(8));
                this.list_of_tasks_priority.add(taskToAdd);
            }
            else if (line.startsWith("nastepne"))
            {
                this.list_of_tasks_priority.poll();
            }
            else if (line.startsWith("zakoncz"))
            {
                return;
            }
            else
            {
                System.out.println("Zle polecenia");
            }
        }
    }
}


class Task implements Comparable<Task> {

    private Short priority;
    private final String description;

    public Task(Short priority, String description) throws Exception {
        setPriority(priority);
        this.description = description;
    }

    public void setPriority(Short priority) throws Exception{
        if (priority > 9){
            throw new Exception("Priority must be a number from 0 to 9.");
        }
        this.priority = priority;
    }

    @Override
    public int compareTo(Task task) {
        return Short.compare(priority, task.priority);
    }

    @Override
    public String toString() {
        return priority + ". Task=" + description;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Task task = (Task) otherObject;
        return priority.equals(task.priority) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return priority*11;
    }

}