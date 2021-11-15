package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.of(2019, 11, 20);
        LocalDate currentDate = LocalDate.now();
        TaskRepository.getTasks()
                .stream()
                .filter(u->u.getDeadline().isAfter(currentDate))
                .map(TaskManager::getTask)
                .forEach(n -> System.out.println(n));
    }
    public static String getTask (Task task){
        return task.getName();
    }
}
