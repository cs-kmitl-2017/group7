package th.ac.kmitl.science.comsci.example.models;

public class Trader extends Person{
    
    public Trader(String id,
                  String name, 
                  String globalId, 
                  String taxId) {
        super();
        setId(id);
        setName(name);
        setGlobalId(globalId);
        setTaxId(taxId);
    }
    
    @Override
    public boolean equals(Object obj) {
        Trader other = (Trader) obj;
        
        return (obj instanceof Trader) &&
                getId().equals(other.getId()) &&
                getName().equals(other.getName()) &&
                getGlobalId().equals(other.getGlobalId()) &&
                getTaxId().equals(other.getTaxId());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
}