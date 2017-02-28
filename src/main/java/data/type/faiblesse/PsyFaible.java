package data.type.faiblesse;

import team.dto.TypeDto;

public class PsyFaible {

    /** Instance unique. */
    public static final PsyFaible INSTANCE = new PsyFaible();

    /**
     * Constructeur privé.
     */
    private PsyFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setCombat(0.5);
        dto.setInsect(2.0);
        dto.setPsy(0.5);
        dto.setSpectr(2.0);
        dto.setTenebr(2.0);
        return dto;
    }
}
