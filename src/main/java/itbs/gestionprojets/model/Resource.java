package itbs.gestionprojets.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String type;
    private BigDecimal cout;
    private Boolean disponibilite;

    @ManyToMany(mappedBy = "resources")
    private List<Project> projects = new ArrayList<>();

    @ManyToMany(mappedBy = "resources")
    private List<Task> tasks = new ArrayList<>();
}