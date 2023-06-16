package Parcial3;
public class LogisticaTransporte extends Logistica{
    private String admiAreasTrabajo_Lgs;
    private int admiCarnetsConducir_Lgs;
    private String admiDirecciones_Lgs;
    private int admiTelefonos_Lgs;
    public LogisticaTransporte() {
    }
    public String getAdmiAreasTrabajo_Lgs() {
        return admiAreasTrabajo_Lgs;
    }
    public void setAdmiAreasTrabajo_Lgs(String admiAreasTrabajo_Lgs) {
        this.admiAreasTrabajo_Lgs = admiAreasTrabajo_Lgs;
    }
    public int getAdmiCarnetsConducir_Lgs() {
        return admiCarnetsConducir_Lgs;
    }
    public void setAdmiCarnetsConducir_Lgs(int admiCarnetsConducir_Lgs) {
        this.admiCarnetsConducir_Lgs = admiCarnetsConducir_Lgs;
    }
    public String getAdmiDirecciones_Lgs() {
        return admiDirecciones_Lgs;
    }
    public void setAdmiDirecciones_Lgs(String admiDirecciones_Lgs) {
        this.admiDirecciones_Lgs = admiDirecciones_Lgs;
    }
    public int getAdmiTelefonos_Lgs() {
        return admiTelefonos_Lgs;
    }
    public void setAdmiTelefonos_Lgs(int admiTelefonos_Lgs) {
        this.admiTelefonos_Lgs = admiTelefonos_Lgs;
    }
    @Override
    public String toString() {
        return "Logistica de Transporte{" +
                "Administrar Areas de Trabajo: '" + admiAreasTrabajo_Lgs + '\'' +
                ", Administrar Carnets de Conducir: " + admiCarnetsConducir_Lgs +
                ", Administrar Direcciones: '" + admiDirecciones_Lgs + '\'' +
                ", Administrar Telefonos/Celulares: " + admiTelefonos_Lgs +
                '}';
    }
}
