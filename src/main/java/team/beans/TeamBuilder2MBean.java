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
import team.dto.NatureDto;
import team.dto.PokemonDto;
import team.dto.StatDto;
import team.service.InitService;
import team.service.TypeService;
import team.utils.Constants;

@ManagedBean
// @Scope("view")
// @ViewScoped
@ApplicationScoped
@Getter
@Setter
public class TeamBuilder2MBean extends AbstractMBean implements Serializable{

    /**
     * ID
     */
    private static final long serialVersionUID = 5643895082516260405L;

    /** Type service */
    @ManagedProperty(value = "#{typeService}")
    private TypeService typeService;

    /** Init service */
    @ManagedProperty(value = "#{initService}")
    private InitService initService;

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

}
