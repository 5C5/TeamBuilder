package data.type.faiblesse;

import team.dto.TypeDto;

public class PlanteFaible {

    /** Instance unique. */
    public static final PlanteFaible INSTANCE = new PlanteFaible();

    /**
     * Constructeur privé.
     */
    private PlanteFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setEau(0.5);
        dto.setElectr(0.5);
        dto.setFeu(2.0);
        dto.setGlace(2.0);
        dto.setInsect(2.0);
        dto.setPlante(0.5);
        dto.setPoison(2.0);
        dto.setSol(0.5);
        dto.setVol(2.0);
        return dto;
    }
}
