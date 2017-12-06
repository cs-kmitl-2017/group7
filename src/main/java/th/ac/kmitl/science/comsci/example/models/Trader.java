package th.ac.kmitl.science.comsci.example.models;

public class Trader extends Person{
    
    public Trader(String name, 
                  String globalId, 
                  String taxId,
                  String uriId) {
        setName(name);
        setGlobalId(globalId);
        setTaxId(taxId);
        setUriId(uriId);
    }

    @Override
    public boolean equals(Object obj) {
        Trader other = (Trader) obj;
        
        return (obj instanceof Trader) && 
                getName().equals(other.getName()) &&
                getGlobalId().equals(other.getGlobalId()) &&
                getTaxId().equals(other.getTaxId()) &&
                getUriId().equals(other.getUriId());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
}
