package team.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatDto {

    private String nom;
    private Integer base;
    private Integer bonus;

    public StatDto(final String nom) {
        this.nom = nom;
        this.base = 0;
        this.bonus = 0;
    }
}
