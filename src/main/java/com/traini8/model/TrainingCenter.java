package com.traini8.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Entity
@Data
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    private String centerCode;

    @Embedded
    @Valid
    private Address address;

    @Min(0)
    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Instant createdOn;

    @Email
    private String contactEmail;

    @NotEmpty
    @Pattern(regexp = "^\\+?[0-9]{10,15}$")
    private String contactPhone;
    @Column(nullable = false)

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
}

}

@Embeddable
@Data
class Address {
    @NotBlank
    private String detailedAddress;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    @Pattern(regexp = "^[1-9][0-9]{5}$")
    private String pincode;
}
