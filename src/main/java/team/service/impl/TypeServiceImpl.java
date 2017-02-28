package team.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import team.dto.TypeDto;
import team.service.TypeService;
import data.type.attaque.AcierAttaque;

@Getter
@Setter
public class TypeServiceImpl implements TypeService, Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 8399574624050114298L;

    @Override
    public List<TypeDto> getTableType() {
        List<TypeDto> typesDto = new ArrayList<TypeDto>();
        typesDto.add(AcierAttaque.INSTANCE.convertDto());

        return typesDto;
    }

}
