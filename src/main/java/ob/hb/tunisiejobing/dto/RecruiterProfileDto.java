package ob.hb.tunisiejobing.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecruiterProfileDto {
    private Long id;

    String description;

    private UserDto user;
}