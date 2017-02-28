package team.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FaiblesseDto {

    private String espece;
    private String nom;

    private TypeDto type;

    private boolean actif = false;

}
