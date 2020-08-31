package rs.sweetchoice.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserGrantDetailsDto {

    private Long id;
    private Long fkUserDetails;
    private Long fkUserGrant;
    private String subGrant;
}