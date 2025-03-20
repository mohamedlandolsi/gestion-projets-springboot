package itbs.gestionprojets.model;

import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Project projet;

    @ManyToOne
    @JoinColumn(name = "responsable_id")
    private Employee responsable;

    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus etat;

    @Enumerated(EnumType.STRING)
    private TaskPriority priorite;

    private LocalDate deadline;

    @ManyToMany
    @JoinTable(
            name = "task_resources",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "resource_id")
    )
    private List<Resource> resources = new ArrayList<>();
}
