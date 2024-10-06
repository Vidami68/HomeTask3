
public class Manufacture 
{
    private String id;
    private String name;
    private String country;

    // Constructors
    public Manufacture() {}

    public Manufacture(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

