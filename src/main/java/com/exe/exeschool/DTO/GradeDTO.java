package com.exe.exeschool.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GradeDTO {

    @NotNull
    private Long id;

    @NotBlank(message = "Score is mandatory")
    @NotNull
    private int score;

    @NotNull
    private Long courseId;

    @NotNull
    private Long studentId;

}
