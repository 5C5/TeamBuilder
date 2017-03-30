package team.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import team.dto.FaiblesseDto;
import team.dto.PokemonDto;
import team.dto.TypeDto;
import team.service.TypeService;
import team.utils.Constants;
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
        return type;
    }

    @Override
    public TypeDto getTypeDto(final String type) {
        if (Constants.ACIER.equalsIgnoreCase(type)) {
            return AcierFaible.INSTANCE.convertDto();
        } else if (Constants.COMBAT.equalsIgnoreCase(type)) {
            return CombatFaible.INSTANCE.convertDto();
        } else if (Constants.DRAGON.equalsIgnoreCase(type)) {
            return DragonFaible.INSTANCE.convertDto();
        } else if (Constants.EAU.equalsIgnoreCase(type)) {
            return EauFaible.INSTANCE.convertDto();
        } else if (Constants.ELECTR.equalsIgnoreCase(type)) {
            return ElectrFaible.INSTANCE.convertDto();
        } else if (Constants.FEU.equalsIgnoreCase(type)) {
            return FeuFaible.INSTANCE.convertDto();
        } else if (Constants.GLACE.equalsIgnoreCase(type)) {
            return GlaceFaible.INSTANCE.convertDto();
        } else if (Constants.INSECT.equalsIgnoreCase(type)) {
            return InsectFaible.INSTANCE.convertDto();
        } else if (Constants.NORMAL.equalsIgnoreCase(type)) {
            return NormalFaible.INSTANCE.convertDto();
        } else if (Constants.PLANTE.equalsIgnoreCase(type)) {
            return PlanteFaible.INSTANCE.convertDto();
        } else if (Constants.POISON.equalsIgnoreCase(type)) {
            return PoisonFaible.INSTANCE.convertDto();
        } else if (Constants.PSY.equalsIgnoreCase(type)) {
            return PsyFaible.INSTANCE.convertDto();
        } else if (Constants.ROCHE.equalsIgnoreCase(type)) {
            return RocheFaible.INSTANCE.convertDto();
        } else if (Constants.SOL.equalsIgnoreCase(type)) {
            return SolFaible.INSTANCE.convertDto();
        } else if (Constants.SPECTR.equalsIgnoreCase(type)) {
            return SpectrFaible.INSTANCE.convertDto();
        } else if (Constants.TENEBR.equalsIgnoreCase(type)) {
            return TenebrFaible.INSTANCE.convertDto();
        } else if (Constants.VOL.equalsIgnoreCase(type)) {
            return VolFaible.INSTANCE.convertDto();
        } else if (Constants.FEE.equalsIgnoreCase(type)) {
            return FeeFaible.INSTANCE.convertDto();
        } else {
            return null;
        }
    }

    @Override
    public List<FaiblesseDto> getTeamFaiblesse(final List<PokemonDto> team) {
        List<FaiblesseDto> listeFaiblesse = new ArrayList<FaiblesseDto>();
        for(PokemonDto poke : team){
            TypeDto type = this.fusionType(this.getTypeDto(poke.getType1()), this.getTypeDto(poke.getType2()), false);
            if (type != null) {
                FaiblesseDto faiblesse = new FaiblesseDto();
                faiblesse.setActif(poke.isActif());
                faiblesse.setEspece(poke.getEspece());
                faiblesse.setNom(poke.getNom());
                faiblesse.setType(new TypeDto());
                faiblesse.getType().setCombat(type.getCombat() > 1.0 ? type.getCombat() : null);
                faiblesse.getType().setDragon(type.getDragon() > 1.0 ? type.getDragon() : null);
                faiblesse.getType().setEau(type.getEau() > 1.0 ? type.getEau() : null);
                faiblesse.getType().setElectr(type.getElectr() > 1.0 ? type.getElectr() : null);
                faiblesse.getType().setFeu(type.getFeu() > 1.0 ? type.getFeu() : null);
                faiblesse.getType().setGlace(type.getGlace() > 1.0 ? type.getGlace() : null);
                faiblesse.getType().setInsect(type.getInsect() > 1.0 ? type.getInsect() : null);
                faiblesse.getType().setNormal(type.getNormal() > 1.0 ? type.getNormal() : null);
                faiblesse.getType().setPlante(type.getPlante() > 1.0 ? type.getPlante() : null);
                faiblesse.getType().setPoison(type.getPoison() > 1.0 ? type.getPoison() : null);
                faiblesse.getType().setPsy(type.getPsy() > 1.0 ? type.getPsy() : null);
                faiblesse.getType().setRoche(type.getRoche() > 1.0 ? type.getRoche() : null);
                faiblesse.getType().setSol(type.getSol() > 1.0 ? type.getSol() : null);
                faiblesse.getType().setSpectr(type.getSpectr() > 1.0 ? type.getSpectr() : null);
                faiblesse.getType().setTenebr(type.getTenebr() > 1.0 ? type.getTenebr() : null);
                faiblesse.getType().setVol(type.getVol() > 1.0 ? type.getVol() : null);
                faiblesse.getType().setFee(type.getFee() > 1.0 ? type.getFee() : null);
                //                 faiblesse.getType().setAcier(type.getAcier() > 1.0 ? type.getAcier() : null);
                //                 faiblesse.getType().setCombat(type.getCombat() > 1.0 ? type.getCombat() : null);
                //                 faiblesse.getType().setDragon(type.getDragon() > 1.0 ? type.getDragon() : null);
                //                 faiblesse.getType().setEau(type.getEau() > 1.0 ? type.getEau() : null);
                //                 faiblesse.getType().setElectr(type.getElectr() > 1.0 ? type.getElectr() : null);
                //                 faiblesse.getType().setFeu(type.getFeu() > 1.0 ? type.getFeu() : null);
                //                 faiblesse.getType().setGlace(type.getGlace() > 1.0 ? type.getGlace() : null);
                //                 faiblesse.getType().setInsect(type.getInsect() > 1.0 ? type.getInsect() : null);
                //                 faiblesse.getType().setNormal(type.getNormal() > 1.0 ? type.getNormal() : null);
                //                 faiblesse.getType().setPlante(type.getPlante() > 1.0 ? type.getPlante() : null);
                //                 faiblesse.getType().setPoison(type.getPoison() > 1.0 ? type.getPoison() : null);
                //                 faiblesse.getType().setPsy(type.getPsy() > 1.0 ? type.getPsy() : null);
                //                 faiblesse.getType().setRoche(type.getRoche() > 1.0 ? type.getRoche() : null);
                //                 faiblesse.getType().setSol(type.getSol() > 1.0 ? type.getSol() : null);
                //                 faiblesse.getType().setSpectr(type.getSpectr() > 1.0 ? type.getSpectr() : null);
                //                 faiblesse.getType().setTenebr(type.getTenebr() > 1.0 ? type.getTenebr() : null);
                //                 faiblesse.getType().setVol(type.getVol() > 1.0 ? type.getVol() : null);
                //                 faiblesse.getType().setFee(type.getFee() > 1.0 ? type.getFee() : null);
                listeFaiblesse.add(faiblesse);
            }
        }
        return listeFaiblesse;
    }

}
