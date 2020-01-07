package cylkowski.virtualmedicalcenter.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Doctor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    private String specialty;

    private String describe;

}
