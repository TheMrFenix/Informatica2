package Parcial3;
public class LogisticaSeguridad extends Logistica{
    private String admiEquiposAsalto_Lgs;
    private int admiCarnet_Lgs;
    private String admiDirecciones_Lgs;
    private int admiAreaDespliegue_Lgs;
    public LogisticaSeguridad() {
    }
    public String getAdmiEquiposAsalto_Lgs() {
        return admiEquiposAsalto_Lgs;
    }
    public void setAdmiEquiposAsalto_Lgs(String admiEquiposAsalto_Lgs) {
        this.admiEquiposAsalto_Lgs = admiEquiposAsalto_Lgs;
    }
    public int getAdmiCarnet_Lgs() {
        return admiCarnet_Lgs;
    }
    public void setAdmiCarnet_Lgs(int admiCarnet_Lgs) {
        this.admiCarnet_Lgs = admiCarnet_Lgs;
    }
    public String getAdmiDirecciones_Lgs() {
        return admiDirecciones_Lgs;
    }
    public void setAdmiDirecciones_Lgs(String admiDirecciones_Lgs) {
        this.admiDirecciones_Lgs = admiDirecciones_Lgs;
    }
    public int getAdmiAreaDespliegue_Lgs() {
        return admiAreaDespliegue_Lgs;
    }
    public void setAdmiAreaDespliegue_Lgs(int admiAreaDespliegue_Lgs) {
        this.admiAreaDespliegue_Lgs = admiAreaDespliegue_Lgs;
    }
    @Override
    public String toString() {
        return "Logistica de la Seguridad{" +
                "Administrar Equipos de Asalto: '" + admiEquiposAsalto_Lgs + '\'' +
                ", Administrar Carnets: " + admiCarnet_Lgs +
                ", Administrar Direcciones: '" + admiDirecciones_Lgs + '\'' +
                ", Administrar Area de Despliegue: " + admiAreaDespliegue_Lgs +
                '}';
    }
}
