package data.type.attaque;

import team.dto.TypeDto;

public class AcierAttaque {

    /** Instance unique. */
    public static final AcierAttaque INSTANCE = new AcierAttaque();

    /**
     * Constructeur privé.
     */
    private AcierAttaque() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setAcier(0.5);
        dto.setEau(0.5);
        dto.setElectr(0.5);
        dto.setFeu(0.5);
        dto.setGlace(2.0);
        dto.setRoche(2.0);
        dto.setFee(2.0);
        return dto;
    }
}
