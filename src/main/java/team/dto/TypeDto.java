package team.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeDto {

    private int idType;
    private String nomType;
    private int ordreType;

    private Double acier;
    private Double combat;
    private Double dragon;
    private Double eau;
    private Double electr;
    private Double feu;
    private Double glace;
    private Double insect;
    private Double normal;
    private Double plante;
    private Double poison;
    private Double psy;
    private Double roche;
    private Double sol;
    private Double spectr;
    private Double tenebr;
    private Double vol;
    private Double fee;

    public TypeDto() {
        this.setAcier(1.0);
        this.setCombat(1.0);
        this.setDragon(1.0);
        this.setEau(1.0);
        this.setElectr(1.0);
        this.setFeu(1.0);
        this.setGlace(1.0);
        this.setInsect(1.0);
        this.setNormal(1.0);
        this.setPlante(1.0);
        this.setPoison(1.0);
        this.setPsy(1.0);
        this.setRoche(1.0);
        this.setSol(1.0);
        this.setSpectr(1.0);
        this.setTenebr(1.0);
        this.setVol(1.0);
        this.setFee(1.0);
    }
}
