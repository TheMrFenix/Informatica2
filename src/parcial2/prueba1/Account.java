package parcial2.prueba1;
public class Account {
    private int id;
    private String name;
    private String Document;
    public Account() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDocument() {
        return Document;
    }
    public void setDocument(String document) {
        Document = document;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Document='" + Document + '\'' +
                '}';
    }
}