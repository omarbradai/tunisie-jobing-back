package ob.hb.tunisiejobing.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "recruiter_profile")
public class RecruiterProfile {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String description;

    @OneToMany(mappedBy = "recruiterProfile")
    private List<Service> services;

    @OneToOne(mappedBy = "recruiterProfile")
    private User user;

}
