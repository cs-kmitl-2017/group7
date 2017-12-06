package th.ac.kmitl.science.comsci.example.models;

public class Seller extends Person{
    
    public Seller(String name, 
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
        Seller other = (Seller) obj;
        
        return (obj instanceof Seller) && 
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
