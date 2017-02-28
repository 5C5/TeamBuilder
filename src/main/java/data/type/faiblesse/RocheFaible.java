package data.type.faiblesse;

import team.dto.TypeDto;

public class RocheFaible {

    /** Instance unique. */
    public static final RocheFaible INSTANCE = new RocheFaible();

    /**
     * Constructeur privé.
     */
    private RocheFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setAcier(2.0);
        dto.setCombat(2.0);
        dto.setEau(2.0);
        dto.setFeu(0.5);
        dto.setNormal(0.5);
        dto.setPlante(2.0);
        dto.setPoison(0.5);
        dto.setSol(2.0);
        dto.setVol(0.5);
        return dto;
    }
}
