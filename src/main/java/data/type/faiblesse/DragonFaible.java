package data.type.faiblesse;

import team.dto.TypeDto;

public class DragonFaible {

    /** Instance unique. */
    public static final DragonFaible INSTANCE = new DragonFaible();

    /**
     * Constructeur privé.
     */
    private DragonFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setDragon(2.0);
        dto.setEau(0.5);
        dto.setElectr(0.5);
        dto.setFeu(0.5);
        dto.setGlace(2.0);
        dto.setPlante(0.5);
        dto.setFee(2.0);
        return dto;
    }
}
