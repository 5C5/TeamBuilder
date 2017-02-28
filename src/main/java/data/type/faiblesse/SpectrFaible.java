package data.type.faiblesse;

import team.dto.TypeDto;

public class SpectrFaible {

    /** Instance unique. */
    public static final SpectrFaible INSTANCE = new SpectrFaible();

    /**
     * Constructeur privé.
     */
    private SpectrFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setCombat(0.0);
        dto.setInsect(0.5);
        dto.setNormal(0.0);
        dto.setSpectr(2.0);
        dto.setTenebr(2.0);
        return dto;
    }
}
