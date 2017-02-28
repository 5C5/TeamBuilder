package data.type.faiblesse;

import team.dto.TypeDto;

public class SolFaible {

    /** Instance unique. */
    public static final SolFaible INSTANCE = new SolFaible();

    /**
     * Constructeur privé.
     */
    private SolFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setEau(2.0);
        dto.setGlace(2.0);
        dto.setPlante(2.0);
        dto.setPoison(0.5);
        dto.setRoche(0.5);
        return dto;
    }
}
