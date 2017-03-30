package team.dto;

import lombok.Getter;
import lombok.Setter;
import team.utils.Constants;

@Getter
@Setter
public class NatureDto {

    private String nom;
    private String bonus;
    private String malus;

    public NatureDto(final String nom, final String bonus, final String malus) {
        this.nom = nom;
        this.bonus = bonus;
        this.malus = malus;
    }

    public NatureDto(final String nom) {
        this(nom, null, null);
        this.nom = nom;
        if (Constants.HARDI.equalsIgnoreCase(nom)) {
            this.setBonusMalus(null, null);
        } else if (Constants.SOLO.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.ATTAQUE, Constants.DEFENSE);
        } else if (Constants.RIGIDE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.ATTAQUE, Constants.ATTAQUE_SPECIAL);
        } else if (Constants.BRAVE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.ATTAQUE, Constants.VITESSE);
        } else if (Constants.MAUVAIS.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.ATTAQUE, Constants.DEFENSE_SPECIAL);
        } else if (Constants.ASSURE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.DEFENSE, Constants.ATTAQUE);
        } else if (Constants.DOCILE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(null, null);
        } else if (Constants.MALIN.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.DEFENSE, Constants.ATTAQUE_SPECIAL);
        } else if (Constants.RELAX.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.DEFENSE, Constants.VITESSE);
        } else if (Constants.LACHE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.DEFENSE, Constants.DEFENSE_SPECIAL);
        } else if (Constants.MODESTE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.ATTAQUE_SPECIAL, Constants.ATTAQUE);
        } else if (Constants.DOUX.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.ATTAQUE_SPECIAL, Constants.DEFENSE);
        } else if (Constants.PUDIQUE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(null, null);
        } else if (Constants.DISCRET.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.ATTAQUE_SPECIAL, Constants.VITESSE);
        } else if (Constants.FOUFOU.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.ATTAQUE_SPECIAL, Constants.DEFENSE_SPECIAL);
        } else if (Constants.TIMIDE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.VITESSE, Constants.ATTAQUE);
        } else if (Constants.PRESSE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.VITESSE, Constants.DEFENSE);
        } else if (Constants.JOVIAL.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.VITESSE, Constants.ATTAQUE_SPECIAL);
        } else if (Constants.SERIEUX.equalsIgnoreCase(nom)) {
            this.setBonusMalus(null, null);
        } else if (Constants.NAIF.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.VITESSE, Constants.DEFENSE_SPECIAL);
        } else if (Constants.CALME.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.DEFENSE_SPECIAL, Constants.ATTAQUE);
        } else if (Constants.GENTIL.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.DEFENSE_SPECIAL, Constants.DEFENSE);
        } else if (Constants.PRUDENT.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.DEFENSE_SPECIAL, Constants.ATTAQUE_SPECIAL);
        } else if (Constants.MALPOLI.equalsIgnoreCase(nom)) {
            this.setBonusMalus(Constants.DEFENSE_SPECIAL, Constants.VITESSE);
        } else if (Constants.BIZARRE.equalsIgnoreCase(nom)) {
            this.setBonusMalus(null, null);
        }
    }

    private void setBonusMalus(final String bonus, final String malus) {
        this.bonus = bonus;
        this.malus = malus;
    }
}
