package com.exe.exeschool.DTO;

import java.util.List;
import java.util.Set;
import lombok.Data;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

@Data
public class StudentDTO {

    @NotBlank(message = "Email is mandatory")
    @NonNull
    private String email;

    @NotBlank(message = "Username is mandatory")
    @NonNull
    private String username;

    @NotBlank(message = "Password is mandatory")
    @NonNull
    private String password;

    @NotBlank(message = "Role is mandatory")
    @NonNull
    private String role;

    @NotBlank(message = "First name is mandatory")
    @NonNull
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    @NonNull
    private String lastName;

    @Min(value = 10, message = "Age should not be less than 10")
    private int age;

    @NotBlank(message = "Address is mandatory")
    @NonNull
    private String address;

    @NotBlank(message = "Phone number is mandatory")
    private String phoneNumber;

    private List<GradeDTO> grades;

    private Set<Long> courseIds;

}
