package data.type.faiblesse;

import team.dto.TypeDto;

public class PoisonFaible {

    /** Instance unique. */
    public static final PoisonFaible INSTANCE = new PoisonFaible();

    /**
     * Constructeur privé.
     */
    private PoisonFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setCombat(0.5);
        dto.setInsect(0.5);
        dto.setPlante(0.5);
        dto.setPoison(0.5);
        dto.setPsy(2.0);
        dto.setSol(2.0);
        dto.setFee(0.5);
        return dto;
    }
}
