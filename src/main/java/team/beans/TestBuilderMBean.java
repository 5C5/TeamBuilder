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
import team.service.TypeService;

@ManagedBean
// @Scope("view")
@ViewScoped
@Getter
@Setter
public class TestBuilderMBean extends AbstractMBean implements Serializable{

    /**
     * ID
     */
    private static final long serialVersionUID = 5643895082516260405L;

    /** Service Notion */
    @ManagedProperty(value = "#{typeService}")
    private TypeService typeService;

    /** Liste des types */
    private List<String> listeType = new ArrayList<String>();

    @PostConstruct
    public void init() {
        // HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        // this.exercice = (Exercice) request.getSession().getAttribute(Constants.BAC_SABLE);
        // this.tableType = this.typeService.getTableType();
        this.listeType.add("1");
        this.listeType.add("2");
        this.listeType.add("3");
        this.listeType.add("4");
        this.listeType.add("5");
        this.listeType.add("6");
        this.listeType.add("7");
        this.listeType.add("8");
        this.listeType.add("9");
        this.listeType.add("10");
        this.listeType.add("11");
        this.listeType.add("12");
        this.listeType.add("13");
        this.listeType.add("14");
        this.listeType.add("15");
        this.listeType.add("16");
        this.listeType.add("17");
        this.listeType.add("18");

    }

}
