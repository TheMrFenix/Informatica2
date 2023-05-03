package parcial2.prueba1;
public class Route extends Trip{
    private String start;
    private String end;
    public Route() {
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + getId() +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}