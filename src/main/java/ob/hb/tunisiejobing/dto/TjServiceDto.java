package ob.hb.tunisiejobing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TjServiceDto {
    private String name;
    private String description;
    @JsonProperty("recruiter-profile")
    private RecruiterProfileDto recruiterProfile;
    private CategoryDto category;
}
