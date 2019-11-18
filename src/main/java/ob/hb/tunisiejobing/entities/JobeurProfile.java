package ob.hb.tunisiejobing.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "jobeur_profile")
public class JobeurProfile {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String description;

    @OneToOne(mappedBy = "jobeurProfile")
    private User user;
}
