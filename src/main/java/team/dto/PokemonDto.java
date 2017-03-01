package team.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokemonDto {

    private Integer id;

    private String nom;
    private String espece;

    private String nature;
    private String talent;

    private String type1;
    private String type2;

    private boolean actif;

    private List<StatDto> stats;
    private List<AttaqueDto> attaques;

    public PokemonDto() {
        this.attaques = new ArrayList<AttaqueDto>();
        this.actif = false;
        this.nom = "";
        this.espece = "";
        this.nature = "";
        this.talent = "";
    }
}
