package team.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import lombok.Getter;
import lombok.Setter;

import org.springframework.context.annotation.Scope;

import team.dto.AttaqueDto;
import team.dto.PokemonDto;
import team.dto.TypeDto;
import team.service.TypeService;

@ManagedBean
@Scope("page")
@Getter
@Setter
public class TeamBuilderMBean extends AbstractMBean implements Serializable{

    /**
     * ID
     */
    private static final long serialVersionUID = 5643895082516260405L;

    /** Service Notion */
    @ManagedProperty(value = "#{typeService}")
    private TypeService typeService;

    /** Table des types */
    private List<TypeDto> tableType = new ArrayList<TypeDto>();

    /** Liste des pokémons */
    private List<PokemonDto> listePokemon = new ArrayList<PokemonDto>();

    /** Liste des types */
    private List<String> listeType = new ArrayList<String>();

    @PostConstruct
    public void init() {
        // HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        // this.exercice = (Exercice) request.getSession().getAttribute(Constants.BAC_SABLE);
        // this.tableType = this.typeService.getTableType();
        this.listeType.add("Acier");
        this.listeType.add("Combat");
        this.listeType.add("Dragon");
        this.listeType.add("Eau");
        this.listeType.add("Electr");
        this.listeType.add("Feu");
        this.listeType.add("Glace");
        this.listeType.add("Insect");
        this.listeType.add("Normal");
        this.listeType.add("Plante");
        this.listeType.add("Poison");
        this.listeType.add("Psy");
        this.listeType.add("Roche");
        this.listeType.add("Sol");
        this.listeType.add("Spectr");
        this.listeType.add("Tenebr");
        this.listeType.add("Vol");
        this.listeType.add("Fee");

        PokemonDto poke = new PokemonDto();
        poke.setNom("Natoo");
        poke.setEspece("Arcanin");
        poke.setType1("Feu");
        AttaqueDto att1 = new AttaqueDto();
        AttaqueDto att2 = new AttaqueDto();
        poke.getAttaques().add(att1);
        poke.getAttaques().add(att2);
        this.listePokemon.add(poke);
        PokemonDto poke2 = new PokemonDto();
        poke2.setNom("Boulon");
        poke2.setEspece("Magezone");
        poke2.setType1("Electr");
        this.listePokemon.add(poke2);
    }

    public void ajoutPoke() {
        PokemonDto poke = new PokemonDto();
        this.listePokemon.add(poke);
    }


}
