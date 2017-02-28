package data.type.faiblesse;

import team.dto.TypeDto;

public class NormalFaible {

    /** Instance unique. */
    public static final NormalFaible INSTANCE = new NormalFaible();

    /**
     * Constructeur privé.
     */
    private NormalFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setCombat(2.0);
        dto.setSpectr(0.0);
        return dto;
    }
}
