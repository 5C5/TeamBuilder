package team.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;
import team.dto.AttaqueDto;
import team.dto.FaiblesseDto;
import team.dto.PokemonDto;
import team.dto.TypeDto;
import team.service.TypeService;

@ManagedBean
// @Scope("view")
@ViewScoped
@Getter
@Setter
public class TeamBuilder2MBean extends AbstractMBean implements Serializable{

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
    private List<PokemonDto> listePokemon;
    /** Nouveau pokémon */
    private String espece = "";
    private String nom = "";
    private String type1 = "";
    private String type2 = "";

    /** Liste des faiblesses */
    private List<FaiblesseDto> listeFaiblesses;
    private FaiblesseDto totalFaiblesse;

    /** Liste des types */
    private List<String> listeType = new ArrayList<String>();

    @PostConstruct
    public void init() {
        // HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        // this.exercice = (Exercice) request.getSession().getAttribute(Constants.BAC_SABLE);
        // this.tableType = this.typeService.getTableType();
        if (this.listePokemon == null) {
            this.listePokemon = new ArrayList<PokemonDto>();
        }
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
        poke.setId(0);
        poke.setActif(true);
        AttaqueDto att1 = new AttaqueDto();
        AttaqueDto att2 = new AttaqueDto();
        poke.getAttaques().add(att1);
        poke.getAttaques().add(att2);
        this.listePokemon.add(poke);
        PokemonDto poke2 = new PokemonDto();
        poke2.setNom("Boulon");
        poke2.setEspece("Magezone");
        poke2.setType1("Electr");
        poke2.setId(1);
        poke2.setActif(true);
        this.listePokemon.add(poke2);
    }

    public void ajoutPoke() {
        PokemonDto poke = new PokemonDto();
        poke.setId(this.listePokemon.size());
        poke.setEspece(this.espece);
        poke.setNom(this.nom);
        poke.setType1(this.type1);
        poke.setType2(this.type2);
        poke.setAttaques(new ArrayList<AttaqueDto>());
        poke.getAttaques().add(new AttaqueDto());
        poke.getAttaques().add(new AttaqueDto());
        poke.getAttaques().add(new AttaqueDto());
        poke.getAttaques().add(new AttaqueDto());
        this.listePokemon.add(poke);
    }

    public void ajouterAttaque(final int id) {
        if (id >= this.listePokemon.size()) {
            return;
        }
        PokemonDto poke = this.listePokemon.get(id);
        poke.getAttaques().add(new AttaqueDto());
    }

    public void retirerAttaquer(final int id) {
        if (id >= this.listePokemon.size()) {
            return;
        }
        PokemonDto poke = this.listePokemon.get(id);
        poke.getAttaques().remove(poke.getAttaques().size() - 1);
    }

    public void calculFaiblesse() {
        this.listeFaiblesses = new ArrayList<FaiblesseDto>();
        this.totalFaiblesse = new FaiblesseDto();
        for (PokemonDto poke : this.listePokemon) {
            FaiblesseDto faible = new FaiblesseDto();
            faible.setEspece(poke.getEspece());
            faible.setNom(poke.getNom());
            faible.setActif(poke.isActif());
            faible.setType(this.typeService.fusionType(this.typeService.getTypeDto(poke.getType1()), this.typeService.getTypeDto(poke.getType2()), false));
            if (poke.isActif()) {
                this.totalFaiblesse.setType(this.typeService.sommeType(this.totalFaiblesse.getType(), faible.getType(), false));
            }
            this.listeFaiblesses.add(faible);
        }

    }

    public void calculForce() {

    }


}
