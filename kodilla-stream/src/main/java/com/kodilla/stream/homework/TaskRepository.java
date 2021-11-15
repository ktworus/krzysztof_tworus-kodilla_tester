package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
    List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("laundry",LocalDate.now(),LocalDate.of(2021,12,25)));
        taskList.add(new Task("shopping",LocalDate.now(),LocalDate.of(2021,12,24)));
        taskList.add(new Task("cleaning",LocalDate.of(2000, 11,11),LocalDate.of(2021,11,11)));
        taskList.add(new Task("cooking",LocalDate.now(),LocalDate.of(2021,12,22)));
        taskList.add(new Task("training",LocalDate.now(),LocalDate.of(2021,12,21)));
        return taskList;
    }
}
