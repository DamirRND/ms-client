package rs.sweetchoice.client.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserDto extends BaseJournalDto {

    private Long id;
    @NotBlank
    @Size(min = 3, max = 30)
    private String name;
    @NotBlank
    @Size(max = 45)
    private String lastName;
    @NotBlank
    @Size(min = 8, max = 45)
    private String username;
    @NotBlank
    @Size(min = 8)
    private String password;
    private String profilePicturePath;
    private Set<UserGrantDetailsDto> userGrants;

}
