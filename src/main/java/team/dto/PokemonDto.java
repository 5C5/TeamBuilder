package team.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;

import team.utils.Constants;

@Getter
@Setter
public class PokemonDto {

    private Integer id;

    private String nom;
    private String espece;

    private NatureDto nature;
    private String talent;

    private String type1;
    private String type2;

    private Integer niveau;

    private boolean actif;

    private List<StatDto> stats;
    private HorizontalBarChartModel chartStat = new HorizontalBarChartModel();
    private List<AttaqueDto> attaques;

    public PokemonDto() {
        this.attaques = new ArrayList<AttaqueDto>();
        this.actif = false;
        this.nom = "";
        this.espece = "";
        this.nature = null;
        this.talent = "";
        this.setStats(new ArrayList<StatDto>());
        this.getStats().add(new StatDto(Constants.PV));
        this.getStats().add(new StatDto(Constants.ATTAQUE));
        this.getStats().add(new StatDto(Constants.DEFENSE));
        this.getStats().add(new StatDto(Constants.ATTAQUE_SPECIAL));
        this.getStats().add(new StatDto(Constants.DEFENSE_SPECIAL));
        this.getStats().add(new StatDto(Constants.VITESSE));
        //        this.getStats().add(new StatDto("Total"));
        this.setAttaques(new ArrayList<AttaqueDto>());
        this.getAttaques().add(new AttaqueDto());
        this.getAttaques().add(new AttaqueDto());
        this.getAttaques().add(new AttaqueDto());
        this.getAttaques().add(new AttaqueDto());
        this.updateChartStat();
    }

    public void updateTotalStat() {
        StatDto total = this.getStats().get(this.getStats().size() - 1);
        int totalBase = 0;
        int totalIV = 0;
        int totalEV = 0;
        int totalTotal = 0;
        for (int i = 0; i < this.getStats().size() - 1; i++) {
            StatDto stat = this.getStats().get(i);
            totalBase += stat.getBase();
            totalIV += stat.getIv();
            totalEV += stat.getEv();
            totalTotal += stat.getTotal();
        }
        total.setBase(totalBase);
        total.setIv(totalIV);
        total.setEv(totalEV);
        total.setTotal(totalTotal);
    }

    public void updateChartStat() {
        ChartSeries chartBase = new ChartSeries();
        chartBase.setLabel("Base");
        chartBase.set(Constants.VITESSE, this.getStats().get(5).getBase());
        chartBase.set(Constants.DEFENSE_SPECIAL, this.getStats().get(4).getBase());
        chartBase.set(Constants.ATTAQUE_SPECIAL, this.getStats().get(3).getBase());
        chartBase.set(Constants.DEFENSE, this.getStats().get(2).getBase());
        chartBase.set(Constants.ATTAQUE, this.getStats().get(1).getBase());
        chartBase.set(Constants.PV, this.getStats().get(0).getBase());
        ChartSeries chartEV = new ChartSeries();
        chartEV.setLabel("EV");
        chartEV.set(Constants.VITESSE, this.getStats().get(5).getEv());
        chartEV.set(Constants.DEFENSE_SPECIAL, this.getStats().get(4).getEv());
        chartEV.set(Constants.ATTAQUE_SPECIAL, this.getStats().get(3).getEv());
        chartEV.set(Constants.DEFENSE, this.getStats().get(2).getEv());
        chartEV.set(Constants.ATTAQUE, this.getStats().get(1).getEv());
        chartEV.set(Constants.PV, this.getStats().get(0).getEv());
        ChartSeries chartIV = new ChartSeries();
        chartIV.setLabel("IV");
        chartIV.set(Constants.VITESSE, this.getStats().get(5).getIv());
        chartIV.set(Constants.DEFENSE_SPECIAL, this.getStats().get(4).getIv());
        chartIV.set(Constants.ATTAQUE_SPECIAL, this.getStats().get(3).getIv());
        chartIV.set(Constants.DEFENSE, this.getStats().get(2).getIv());
        chartIV.set(Constants.ATTAQUE, this.getStats().get(1).getIv());
        chartIV.set(Constants.PV, this.getStats().get(0).getIv());

        this.chartStat = new HorizontalBarChartModel();
        this.chartStat.addSeries(chartBase);
        this.chartStat.addSeries(chartEV);
        this.chartStat.addSeries(chartIV);

        this.chartStat.setLegendPosition("e");
        this.chartStat.setStacked(true);

        Axis xAxis = this.chartStat.getAxis(AxisType.X);
        xAxis.setMin(0);
        xAxis.setMax(500);
        xAxis.setTickInterval("50");

        Axis yAxis = this.chartStat.getAxis(AxisType.Y);
    }
}
