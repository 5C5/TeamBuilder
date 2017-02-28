package data.type.faiblesse;

import team.dto.TypeDto;

public class FeuFaible {

    /** Instance unique. */
    public static final FeuFaible INSTANCE = new FeuFaible();

    /**
     * Constructeur privé.
     */
    private FeuFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setAcier(0.5);
        dto.setEau(2.0);
        dto.setFeu(0.5);
        dto.setGlace(0.5);
        dto.setInsect(0.5);
        dto.setPlante(0.5);
        dto.setRoche(2.0);
        dto.setSol(2.0);
        dto.setFee(0.5);
        return dto;
    }
}
