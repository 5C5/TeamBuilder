package data.type.faiblesse;

import team.dto.TypeDto;

public class TenebrFaible {

    /** Instance unique. */
    public static final TenebrFaible INSTANCE = new TenebrFaible();

    /**
     * Constructeur privé.
     */
    private TenebrFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setCombat(2.0);
        dto.setInsect(2.0);
        dto.setPsy(0.0);
        dto.setSpectr(0.5);
        dto.setTenebr(0.5);
        dto.setFee(2.0);
        return dto;
    }
}
