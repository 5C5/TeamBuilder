package data.type.faiblesse;

import team.dto.TypeDto;

public class EauFaible {

    /** Instance unique. */
    public static final EauFaible INSTANCE = new EauFaible();

    /**
     * Constructeur privé.
     */
    private EauFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setAcier(0.5);
        dto.setEau(0.5);
        dto.setElectr(2.0);
        dto.setFeu(0.5);
        dto.setGlace(0.5);
        dto.setPlante(2.0);
        dto.setSol(0.5);
        return dto;
    }
}
