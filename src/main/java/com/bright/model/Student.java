package com.bright.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int age ;
    private String name;

    public static void main(String[] args) {
        Student bright = new Student(28, "bright");
        System.out.println(bright);
    }
}
