package Proyecto_Informatica_2;
public class LogisticaRiesgo {
    private String admiPais_Lgs;
    private String admiZonaHoraria_Lgs;
    private String admiGeografia_Lgs;
    private String admiBiomaRegional_Lgs;
    private String admiNivelProteccion_Lgs;
    public LogisticaRiesgo() {
    }
    public String getAdmiPais_Lgs() {
        return admiPais_Lgs;
    }
    public void setAdmiPais_Lgs(String admiPais_Lgs) {
        this.admiPais_Lgs = admiPais_Lgs;
    }
    public String getAdmiZonaHoraria_Lgs() {
        return admiZonaHoraria_Lgs;
    }
    public void setAdmiZonaHoraria_Lgs(String admiZonaHoraria_Lgs) {
        this.admiZonaHoraria_Lgs = admiZonaHoraria_Lgs;
    }
    public String getAdmiGeografia_Lgs() {
        return admiGeografia_Lgs;
    }
    public void setAdmiGeografia_Lgs(String admiGeografia_Lgs) {
        this.admiGeografia_Lgs = admiGeografia_Lgs;
    }
    public String getAdmiBiomaRegional_Lgs() {
        return admiBiomaRegional_Lgs;
    }
    public void setAdmiBiomaRegional_Lgs(String admiBiomaRegional_Lgs) {
        this.admiBiomaRegional_Lgs = admiBiomaRegional_Lgs;
    }
    public String getAdmiNivelProteccion_Lgs() {
        return admiNivelProteccion_Lgs;
    }
    public void setAdmiNivelProteccion_Lgs(String admiNivelProteccion_Lgs) {
        this.admiNivelProteccion_Lgs = admiNivelProteccion_Lgs;
    }
    @Override
    public String toString() {
        return "Logistica del Nivel de Riesgo{" +
                "Admiministrar Pais: '" + admiPais_Lgs + '\'' +
                ", Administrar Zona Horaria: '" + admiZonaHoraria_Lgs + '\'' +
                ", Administrar Geografia: '" + admiGeografia_Lgs + '\'' +
                ", Administrar Bioma Regional: '" + admiBiomaRegional_Lgs + '\'' +
                ", Administrar Nivel de Proteccion: '" + admiNivelProteccion_Lgs + '\'' +
                '}';
    }
}
