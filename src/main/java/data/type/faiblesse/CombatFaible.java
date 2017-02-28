package data.type.faiblesse;

import team.dto.TypeDto;

public class CombatFaible {

    /** Instance unique. */
    public static final CombatFaible INSTANCE = new CombatFaible();

    /**
     * Constructeur privé.
     */
    private CombatFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setInsect(0.5);
        dto.setPsy(2.0);
        dto.setRoche(0.5);
        dto.setTenebr(0.5);
        dto.setVol(2.0);
        dto.setFee(2.0);
        return dto;
    }
}
