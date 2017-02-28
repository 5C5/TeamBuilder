package data.type.faiblesse;

import team.dto.TypeDto;

public class AcierFaible {

    /** Instance unique. */
    public static final AcierFaible INSTANCE = new AcierFaible();

    /**
     * Constructeur privé.
     */
    private AcierFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setAcier(0.5);
        dto.setCombat(2.0);
        dto.setDragon(0.5);
        dto.setFeu(2.0);
        dto.setGlace(0.5);
        dto.setInsect(0.5);
        dto.setNormal(0.5);
        dto.setPlante(0.5);
        dto.setPoison(0.0);
        dto.setPsy(0.5);
        dto.setRoche(0.5);
        dto.setSol(2.0);
        dto.setVol(0.5);
        dto.setFee(0.5);
        return dto;
    }
}
