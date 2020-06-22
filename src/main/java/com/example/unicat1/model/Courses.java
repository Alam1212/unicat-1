package com.example.unicat1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
    private String courseName;
    private String instructorName;
    private String description;
    private int numbers;
    private int rating;
    private int price;
}
