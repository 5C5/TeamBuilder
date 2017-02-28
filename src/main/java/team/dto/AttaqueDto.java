package team.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttaqueDto {

    private String nom;
    private String puissance;
    private String precision;
    private String type;
    private String genre;
    private boolean actif;

    public AttaqueDto() {
        this.actif = false;
    }
}
