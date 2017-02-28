package data.type.faiblesse;

import team.dto.TypeDto;

public class InsectFaible {

    /** Instance unique. */
    public static final InsectFaible INSTANCE = new InsectFaible();

    /**
     * Constructeur privé.
     */
    private InsectFaible() {
        super();
    }

    public TypeDto convertDto() {
        TypeDto dto = new TypeDto();
        dto.setCombat(0.5);
        dto.setFeu(2.0);
        dto.setPlante(0.5);
        dto.setRoche(2.0);
        dto.setVol(2.0);
        return dto;
    }
}
