package data.type.faiblesse;

import team.dto.TypeDto;

public class VolFaible {

    /** Instance unique. */
    public static final VolFaible INSTANCE = new VolFaible();

    /**
     * Constructeur privé.
     */
    private VolFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setCombat(0.5);
        dto.setElectr(2.0);
        dto.setGlace(2.0);
        dto.setInsect(0.5);
        dto.setPlante(0.5);
        dto.setRoche(2.0);
        dto.setSol(0.0);
        return dto;
    }
}
