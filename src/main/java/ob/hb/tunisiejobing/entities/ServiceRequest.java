package ob.hb.tunisiejobing.entities;

import javax.persistence.*;

@Entity
@Table(name = "service_request")
public class ServiceRequest {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "jobeur_profile_id")
    private JobeurProfile jobeurProfile;
}
