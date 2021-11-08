package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> studentsList = new ArrayList<>();
    String schoolName;
    public School(String schoolName, int... studentsList){
    this.schoolName = schoolName;
        for (int  students : studentsList)
            this.studentsList.add(students);

    }
    public int getSum(){
        int sum = 0;
        for(int students : studentsList)
            sum += students;
        return sum;
    }


    @Override
    public String toString() {
        return schoolName + " school"
                ;
    }
}
