package com.exe.exeschool.DTO;

import lombok.NonNull;


import java.util.List;
import java.util.Set;

import jakarta.validation.constraints.NotBlank;

import lombok.NonNull;
import lombok.Data;




@Data
public class CourseDTO {

   @NonNull
    private Long id;

    @NotBlank(message = "Subject is mandatory")
    @NonNull
    private String subject;

    @NotBlank(message = "Code is mandatory")
    @NonNull
    private String code;

    @NotBlank(message = "Description is mandatory")
    @NonNull
    private String description;

    @NotBlank(message = "Credit is mandatory")
    private int credit;

    private Set<Long> studentIds;
    private List<GradeDTO> grades;


}