package team.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import team.dto.TypeDto;
import team.service.TypeService;
import data.type.attaque.AcierAttaque;
import data.type.faiblesse.AcierFaible;
import data.type.faiblesse.CombatFaible;
import data.type.faiblesse.DragonFaible;
import data.type.faiblesse.EauFaible;
import data.type.faiblesse.ElectrFaible;
import data.type.faiblesse.FeeFaible;
import data.type.faiblesse.FeuFaible;
import data.type.faiblesse.GlaceFaible;
import data.type.faiblesse.InsectFaible;
import data.type.faiblesse.NormalFaible;
import data.type.faiblesse.PlanteFaible;
import data.type.faiblesse.PoisonFaible;
import data.type.faiblesse.PsyFaible;
import data.type.faiblesse.RocheFaible;
import data.type.faiblesse.SolFaible;
import data.type.faiblesse.SpectrFaible;
import data.type.faiblesse.TenebrFaible;
import data.type.faiblesse.VolFaible;

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

    @Override
    public TypeDto fusionType(final TypeDto type1, final TypeDto type2, final boolean force) {
        if (type1 == null) {
            return type2;
        }
        if (type2 == null) {
            return type1;
        }
        TypeDto type = new TypeDto();
        type.setAcier(type1.getAcier() * type2.getAcier());
        type.setCombat(type1.getCombat() * type2.getCombat());
        type.setDragon(type1.getDragon() * type2.getAcier());
        type.setEau(type1.getEau() * type2.getEau());
        type.setElectr(type1.getElectr() * type2.getElectr());
        type.setFeu(type1.getFeu() * type2.getFeu());
        type.setGlace(type1.getGlace() * type2.getInsect());
        type.setInsect(type1.getInsect() * type2.getInsect());
        type.setNormal(type1.getNormal() * type2.getNormal());
        type.setPlante(type1.getPlante() * type2.getPlante());
        type.setPoison(type1.getPoison() * type2.getPoison());
        type.setPsy(type1.getPsy() * type2.getPsy());
        type.setRoche(type1.getRoche() * type2.getRoche());
        type.setSol(type1.getSol() * type2.getSol());
        type.setSpectr(type1.getSpectr() * type2.getSpectr());
        type.setTenebr(type1.getTenebr() * type2.getTenebr());
        type.setVol(type1.getVol() * type2.getVol());
        type.setFee(type1.getFee() * type2.getFee());
        type.purge(force);
        return type;
    }


    @Override
    public TypeDto sommeType(final TypeDto type1, final TypeDto type2, final boolean force) {
        if (type1 == null) {
            return type2;
        }
        if (type2 == null) {
            return type1;
        }
        TypeDto type = new TypeDto();
        type.setAcier(type1.getAcier() + type2.getAcier());
        type.setCombat(type1.getCombat() + type2.getCombat());
        type.setDragon(type1.getDragon() + type2.getAcier());
        type.setEau(type1.getEau() + type2.getEau());
        type.setElectr(type1.getElectr() + type2.getElectr());
        type.setFeu(type1.getFeu() + type2.getFeu());
        type.setGlace(type1.getGlace() + type2.getInsect());
        type.setInsect(type1.getInsect() + type2.getInsect());
        type.setNormal(type1.getNormal() + type2.getNormal());
        type.setPlante(type1.getPlante() + type2.getPlante());
        type.setPoison(type1.getPoison() + type2.getPoison());
        type.setPsy(type1.getPsy() + type2.getPsy());
        type.setRoche(type1.getRoche() + type2.getRoche());
        type.setSol(type1.getSol() + type2.getSol());
        type.setSpectr(type1.getSpectr() + type2.getSpectr());
        type.setTenebr(type1.getTenebr() + type2.getTenebr());
        type.setVol(type1.getVol() + type2.getVol());
        type.setFee(type1.getFee() + type2.getFee());
        type.purge(force);
        return type;
    }

    @Override
    public TypeDto getTypeDto(final String type) {
        if ("Acier".equalsIgnoreCase(type)) {
            return AcierFaible.INSTANCE.convertDto();
        } else if ("Combat".equalsIgnoreCase(type)) {
            return CombatFaible.INSTANCE.convertDto();
        } else if ("Dragon".equalsIgnoreCase(type)) {
            return DragonFaible.INSTANCE.convertDto();
        } else if ("Eau".equalsIgnoreCase(type)) {
            return EauFaible.INSTANCE.convertDto();
        } else if ("Electr".equalsIgnoreCase(type)) {
            return ElectrFaible.INSTANCE.convertDto();
        } else if ("Feu".equalsIgnoreCase(type)) {
            return FeuFaible.INSTANCE.convertDto();
        } else if ("Glace".equalsIgnoreCase(type)) {
            return GlaceFaible.INSTANCE.convertDto();
        } else if ("Insect".equalsIgnoreCase(type)) {
            return InsectFaible.INSTANCE.convertDto();
        } else if ("Normal".equalsIgnoreCase(type)) {
            return NormalFaible.INSTANCE.convertDto();
        } else if ("Plante".equalsIgnoreCase(type)) {
            return PlanteFaible.INSTANCE.convertDto();
        } else if ("Poison".equalsIgnoreCase(type)) {
            return PoisonFaible.INSTANCE.convertDto();
        } else if ("Psy".equalsIgnoreCase(type)) {
            return PsyFaible.INSTANCE.convertDto();
        } else if ("Roche".equalsIgnoreCase(type)) {
            return RocheFaible.INSTANCE.convertDto();
        } else if ("Sol".equalsIgnoreCase(type)) {
            return SolFaible.INSTANCE.convertDto();
        } else if ("Spectr".equalsIgnoreCase(type)) {
            return SpectrFaible.INSTANCE.convertDto();
        } else if ("Tenebr".equalsIgnoreCase(type)) {
            return TenebrFaible.INSTANCE.convertDto();
        } else if ("Vol".equalsIgnoreCase(type)) {
            return VolFaible.INSTANCE.convertDto();
        } else if ("Fee".equalsIgnoreCase(type)) {
            return FeeFaible.INSTANCE.convertDto();
        } else {
            return null;
        }
    }

}
