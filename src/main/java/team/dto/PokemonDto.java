package team.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokemonDto {

    private String nom;
    private String espece;

    private String type1;
    private String type2;

    private boolean actif;

    private List<AttaqueDto> attaques;

    public PokemonDto() {
        this.attaques = new ArrayList<AttaqueDto>();
        this.actif = false;
    }
}
