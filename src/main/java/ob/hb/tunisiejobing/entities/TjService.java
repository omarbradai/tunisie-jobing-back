package ob.hb.tunisiejobing.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "service")
public class TjService {
    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer price;
    @Column
    private Integer duration;
    @Column(name = "duration_type")
    private String durationType;
    @ManyToOne
    @JoinColumn(name = "recruiter_profile_id", referencedColumnName = "id")
    private RecruiterProfile recruiterProfile;
    @ManyToOne()
    private Category category;
}
