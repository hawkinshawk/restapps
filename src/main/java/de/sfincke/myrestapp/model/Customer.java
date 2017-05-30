package de.sfincke.myrestapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long number;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;

}
