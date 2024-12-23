package ua.edu.ucu.apps.task1;

import lombok.Builder;
import lombok.ToString;

enum Gender {
    MALE, FEMALE
}

@ToString
@Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}