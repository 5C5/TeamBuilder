package team.service;

import java.util.List;

import team.dto.NatureDto;




/**
 * Interface de definition des methodes permettant d'initialiser les composants
 */
public interface InitService {

    public List<String> initListeType();

    public List<NatureDto> initListeNature();
}
