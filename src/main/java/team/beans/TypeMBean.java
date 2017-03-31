package team.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import lombok.Getter;
import lombok.Setter;
import team.dto.AttaqueDto;
import team.dto.FaiblesseDto;
import team.dto.NatureDto;
import team.dto.PokemonDto;
import team.dto.StatDto;
import team.dto.TypeDto;
import team.service.InitService;
import team.service.TypeService;
import team.utils.Constants;

@ManagedBean
// @Scope("view")
// @ViewScoped
@ApplicationScoped
@Getter
@Setter
public class TypeMBean extends AbstractMBean implements Serializable {

    /**
     * ID
     */
    private static final long serialVersionUID = 5783895082516260405L;

    /** Type service */
    @ManagedProperty(value = "#{typeService}")
    private TypeService typeService;

    /** Init service */
    @ManagedProperty(value = "#{initService}")
    private InitService initService;

    /** Table des types */
    private List<TypeDto> tableType = new ArrayList<TypeDto>();

    /** Liste des pokémons */
    private List<PokemonDto> listePokemon;
    /** Nouveau pokémon */
    private String espece = "";
    private String nom = "";
    private String type1 = "";
    private String type2 = "";
    private String nature = "";
    private String talent = "";

    /** Pokemon en cours de modification */
    private Integer idPokemonEnCours;

    /** Liste des faiblesses */
    private List<FaiblesseDto> listeFaiblesses;
    private FaiblesseDto totalFaiblesse;

    /** Liste des types */
    private List<String> listeType = new ArrayList<String>();

    /** Liste des natures */
    private List<NatureDto> listeNature = new ArrayList<NatureDto>();

    @PostConstruct
    public void init() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        this.listePokemon = (List<PokemonDto>) request.getSession().getAttribute(Constants.TEAM);
        if (this.listePokemon == null) {
            this.listePokemon = new ArrayList<PokemonDto>();
        }
        this.listeType = this.initService.initListeType();
        this.listeNature = this.initService.initListeNature();
    }

    public void ajoutPoke() {
        PokemonDto poke = new PokemonDto();
        poke.setId(this.listePokemon.size());
        poke.setEspece(this.espece);
        poke.setNom(this.nom);
        poke.setType1(this.type1);
        poke.setType2(this.type2);
        poke.setNature(new NatureDto(this.nature));
        poke.setTalent(this.talent);
        poke.setNiveau(100);
        this.listePokemon.add(poke);

        // reset
        this.espece = "";
        this.nom = "";
        this.type1 = "";
        this.type2 = "";
        this.nature = "";
        this.talent = "";
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
        this.listeFaiblesses = this.typeService.getTeamFaiblesse(this.listePokemon);
        this.totalFaiblesse = new FaiblesseDto();

    }

    public void calculForce() {

    }

    private void initPoke() {
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

    public void onCellEditStat(final PokemonDto pokeEnCours) {
        for (StatDto stat : pokeEnCours.getStats()) {
            stat.setTotal(stat.calculTotal(pokeEnCours.getNature().getBonus(), pokeEnCours.getNature().getMalus(), pokeEnCours.getNiveau()));
        }
    }

    public void updatePoke(final Integer id) {
        PokemonDto pokeEnCours = this.listePokemon.get(id);
        if (pokeEnCours != null) {
            pokeEnCours.updateChartStat();
            // pokeEnCours.updateTotalStat();
        }
    }

    public String supprimerPoke(final Integer id) {
        List<PokemonDto> listeRemoved = new ArrayList<PokemonDto>();
        for (int i = 0; i < this.listePokemon.size(); i++) {
            if (i != id) {
                listeRemoved.add(this.listePokemon.get(i));
            }
        }
        this.listePokemon = new ArrayList<PokemonDto>();
        this.listePokemon.addAll(listeRemoved);
        System.out.println(this.listePokemon.size());
        return "builder2";
    }
}
