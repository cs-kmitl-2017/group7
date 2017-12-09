package th.ac.kmitl.science.comsci.example.models;

public class Product {
    
    private String id;
    private String globalId;
    private String name;
    
    public Product(){
        
    }

    public Product(String id, String globalId, String name) {
        this.id = id;
        this.globalId = globalId;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }
    
     public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
