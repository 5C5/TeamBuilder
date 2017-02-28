package data.type.faiblesse;

import team.dto.TypeDto;

public class GlaceFaible {

    /** Instance unique. */
    public static final GlaceFaible INSTANCE = new GlaceFaible();

    /**
     * Constructeur privé.
     */
    private GlaceFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setAcier(2.0);
        dto.setCombat(2.0);
        dto.setFeu(2.0);
        dto.setGlace(0.5);
        dto.setRoche(2.0);
        return dto;
    }
}
