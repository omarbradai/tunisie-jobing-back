package ob.hb.tunisiejobing.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column
    private String fullname;
    @Column
    private Integer age;
    @Column
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jobeur_profile_id", referencedColumnName = "id")
    private JobeurProfile jobeurProfile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recruiter_profile_id", referencedColumnName = "id")
    private RecruiterProfile recruiterProfile;

}
