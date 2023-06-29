package Proyecto_Informatica_2;
public class NiveldeRiesgo {
    private String pais_Seg;
    private String zonaHoraria_Seg;
    private String geografia_Seg;
    private String biomaRegional_Seg;
    //private String seguridadDestinada_Seg;
    public NiveldeRiesgo() {
    }
    public String getPais_Seg() {
        return pais_Seg;
    }
    public void setPais_Seg(String pais_Seg) {
        this.pais_Seg = pais_Seg;
    }
    public String getZonaHoraria_Seg() {
        return zonaHoraria_Seg;
    }
    public void setZonaHoraria_Seg(String zonaHoraria_Seg) {
        this.zonaHoraria_Seg = zonaHoraria_Seg;
    }
    public String getGeografia_Seg() {
        return geografia_Seg;
    }
    public void setGeografia_Seg(String geografia_Seg) {
        this.geografia_Seg = geografia_Seg;
    }
    public String getBiomaRegional_Seg() {
        return biomaRegional_Seg;
    }
    public void setBiomaRegional_Seg(String biomaRegional_Seg) {
        this.biomaRegional_Seg = biomaRegional_Seg;
    }
    @Override
    public String toString() {
        return "Nivel de Riesgo{" +
                "Pais destino de la ruta: '" + pais_Seg + '\'' +
                ", Zona Horaria: '" + zonaHoraria_Seg + '\'' +
                ", Geografia: '" + geografia_Seg + '\'' +
                ", Bioma Regional: '" + biomaRegional_Seg + '\'' + //sin tiempo de detallar
                '}';
    }
}
