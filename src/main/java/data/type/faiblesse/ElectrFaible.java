package data.type.faiblesse;

import team.dto.TypeDto;

public class ElectrFaible {

    /** Instance unique. */
    public static final ElectrFaible INSTANCE = new ElectrFaible();

    /**
     * Constructeur privé.
     */
    private ElectrFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setAcier(0.5);
        dto.setElectr(0.5);
        dto.setSol(2.0);
        dto.setVol(0.5);
        return dto;
    }
}
