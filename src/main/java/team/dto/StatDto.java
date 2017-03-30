package team.dto;

import lombok.Getter;
import lombok.Setter;
import team.utils.Constants;

@Getter
@Setter
public class StatDto {

    private String nom;
    private Integer base;
    private Integer iv;
    private Integer ev;

    private Integer total;

    public StatDto(final String nom) {
        this.nom = nom;
        this.base = 0;
        this.iv = 0;
        this.ev = 0;
        this.total = this.calculTotal(null, null, null);
    }

    public Integer calculTotal(final String bonus, final String malus, final Integer niveauPokemon) {
        double niveau = 100.0;
        double nature = 1.0;
        int total = 0;
        if (this.nom.equalsIgnoreCase(bonus)) {
            nature = 1.1; // bonus 10%
        } else if (this.nom.equalsIgnoreCase(malus)) {
            nature = 0.9; // malus 10%
        }
        if (niveauPokemon != null) {
            niveau = niveauPokemon;
        }
        if (Constants.PV.equalsIgnoreCase(this.nom)) {
            total = (int) Math.floor((this.iv + 2.0 * this.base + Math.floor(this.ev / 4)) * (niveau / 100.0) + 10.0 + niveau);
        } else {
            total = (int) Math.floor(Math.floor((this.iv + 2 * this.base + Math.floor(this.ev / 4)) * (niveau / 100) + 5) * nature);
        }

        return total;
    }

}
