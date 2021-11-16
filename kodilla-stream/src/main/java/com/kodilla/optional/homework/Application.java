package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John ",null));
        students.add(new Student("James ", new Teacher("Mrs. James")));
        students.add(new Student("Mark ", new Teacher("Mrs. Cameron")));
        students.add(new Student("Wayne ", new Teacher("Mr. Barns")));
        students.add(new Student("Dwight ", null));


      /* for (Student student:
             students) {Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
                optionalTeacher.ifPresent((u-> System.out.println(u.getName())));
        }*/
        for (Student student:
                students) {Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));
           System.out.println(student.getName() +" "+teacher.getName());
        }






        }
    }

