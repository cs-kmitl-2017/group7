package th.ac.kmitl.science.comsci.example.models;

public class Seller extends Person{
    
    public Seller(String name, 
                  String globalId, 
                  String taxId,
                  String uriId, 
                  String email) {
        setName(name);
        setGlobalId(globalId);
        setTaxId(taxId);
        setUriId(uriId);
        setEmail(email);
    }

    @Override
    public boolean equals(Object obj) {
        Seller other = (Seller) obj;
        
        /* 
         * return true, if the other object is Seller class
         * and the other object has value of attribute same this class
         */
        return (obj instanceof Seller) && 
                getName().equals(other.getName()) &&
                getGlobalId().equals(other.getGlobalId()) &&
                getTaxId().equals(other.getTaxId()) &&
                getUriId().equals(other.getUriId()) &&
                getEmail().equals(other.getEmail());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
}
