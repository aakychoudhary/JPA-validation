package com.example.validation.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class UserRequest {

    @NotNull(message = "Name should not null ")
    private String name;

@Email(message = "Email should j")
    private String email;

    @NotNull(message = "Mobile number cannot be null")
    @Pattern(
            regexp = "^[6-9]\\d{9}$",
            message = "Mobile number must be 10 digits and start with 6-9"
    )
    private String mobile;

    @NotNull(message = "Gender cannot be null")
    @Pattern(
            regexp = "^(Male|Female|Other)$",
            message = "Gender must be Male, Female, or Other"
    )
    private String gender;

    @Min(18)
    @Max(100)

    private int age;

@NotBlank
    private String nationality;
}
