package ob.hb.tunisiejobing.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor
@Table(name = "message")
public class Message {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "service_request_id")
    private ServiceRequest serviceRequest;

    @Column
    String text;
}
