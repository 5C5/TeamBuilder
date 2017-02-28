package team.service;

import java.util.List;

import team.dto.TypeDto;




/**
 * Interface de definition des methodes permettant d'acceder au DAO Type
 */
public interface TypeService {

    /**
     * Récupérer la table des types
     *
     * @return liste de TypeDto
     */
    public List<TypeDto> getTableType();

    public TypeDto fusionType(final TypeDto type1, final TypeDto type2, final boolean force);

    public TypeDto sommeType(final TypeDto type1, final TypeDto type2, final boolean force);

    public TypeDto getTypeDto(final String type);
}
