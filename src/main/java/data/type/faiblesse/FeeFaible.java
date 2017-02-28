package data.type.faiblesse;

import team.dto.TypeDto;

public class FeeFaible {

    /** Instance unique. */
    public static final FeeFaible INSTANCE = new FeeFaible();

    /**
     * Constructeur privé.
     */
    private FeeFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setAcier(2.0);
        dto.setCombat(0.5);
        dto.setDragon(0.0);
        dto.setInsect(0.5);
        dto.setPoison(2.0);
        dto.setTenebr(0.5);
        return dto;
    }
}
