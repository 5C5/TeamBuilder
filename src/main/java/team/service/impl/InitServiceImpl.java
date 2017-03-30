package team.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import team.dto.NatureDto;
import team.service.InitService;
import team.utils.Constants;

@Getter
@Setter
public class InitServiceImpl implements InitService, Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 8499574628420114298L;

    @Override
    public List<String> initListeType() {
        List<String> listeType = new ArrayList<String>();
        listeType.add(Constants.ACIER);
        listeType.add(Constants.COMBAT);
        listeType.add(Constants.DRAGON);
        listeType.add(Constants.EAU);
        listeType.add(Constants.ELECTR);
        listeType.add(Constants.FEU);
        listeType.add(Constants.GLACE);
        listeType.add(Constants.INSECT);
        listeType.add(Constants.NORMAL);
        listeType.add(Constants.PLANTE);
        listeType.add(Constants.POISON);
        listeType.add(Constants.PSY);
        listeType.add(Constants.ROCHE);
        listeType.add(Constants.SOL);
        listeType.add(Constants.SPECTR);
        listeType.add(Constants.TENEBR);
        listeType.add(Constants.VOL);
        listeType.add(Constants.FEE);
        return listeType;
    }

    @Override
    public List<NatureDto> initListeNature() {
        List<NatureDto> listeNature = new ArrayList<NatureDto>();
        listeNature.add(new NatureDto(Constants.HARDI, null, null));
        listeNature.add(new NatureDto(Constants.SOLO, Constants.ATTAQUE, Constants.DEFENSE));
        listeNature.add(new NatureDto(Constants.RIGIDE, Constants.ATTAQUE, Constants.ATTAQUE_SPECIAL));
        listeNature.add(new NatureDto(Constants.BRAVE, Constants.ATTAQUE, Constants.VITESSE));
        listeNature.add(new NatureDto(Constants.MAUVAIS, Constants.ATTAQUE, Constants.DEFENSE_SPECIAL));
        listeNature.add(new NatureDto(Constants.ASSURE, Constants.DEFENSE, Constants.ATTAQUE));
        listeNature.add(new NatureDto(Constants.DOCILE, null, null));
        listeNature.add(new NatureDto(Constants.MALIN, Constants.DEFENSE, Constants.ATTAQUE_SPECIAL));
        listeNature.add(new NatureDto(Constants.RELAX, Constants.DEFENSE, Constants.VITESSE));
        listeNature.add(new NatureDto(Constants.LACHE, Constants.DEFENSE, Constants.DEFENSE_SPECIAL));
        listeNature.add(new NatureDto(Constants.MODESTE, Constants.ATTAQUE_SPECIAL, Constants.ATTAQUE));
        listeNature.add(new NatureDto(Constants.DOUX, Constants.ATTAQUE_SPECIAL, Constants.DEFENSE));
        listeNature.add(new NatureDto(Constants.PUDIQUE, null, null));
        listeNature.add(new NatureDto(Constants.DISCRET, Constants.ATTAQUE_SPECIAL, Constants.VITESSE));
        listeNature.add(new NatureDto(Constants.FOUFOU, Constants.ATTAQUE_SPECIAL, Constants.DEFENSE_SPECIAL));
        listeNature.add(new NatureDto(Constants.TIMIDE, Constants.VITESSE, Constants.ATTAQUE));
        listeNature.add(new NatureDto(Constants.PRESSE, Constants.VITESSE, Constants.DEFENSE));
        listeNature.add(new NatureDto(Constants.JOVIAL, Constants.VITESSE, Constants.ATTAQUE_SPECIAL));
        listeNature.add(new NatureDto(Constants.SERIEUX, null, null));
        listeNature.add(new NatureDto(Constants.NAIF, Constants.VITESSE, Constants.DEFENSE_SPECIAL));
        listeNature.add(new NatureDto(Constants.CALME, Constants.DEFENSE_SPECIAL, Constants.ATTAQUE));
        listeNature.add(new NatureDto(Constants.GENTIL, Constants.DEFENSE_SPECIAL, Constants.DEFENSE));
        listeNature.add(new NatureDto(Constants.PRUDENT, Constants.DEFENSE_SPECIAL, Constants.ATTAQUE_SPECIAL));
        listeNature.add(new NatureDto(Constants.MALPOLI, Constants.DEFENSE_SPECIAL, Constants.VITESSE));
        listeNature.add(new NatureDto(Constants.BIZARRE, null, null));
        return listeNature;
    }

}
