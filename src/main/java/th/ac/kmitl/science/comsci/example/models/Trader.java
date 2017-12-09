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
        Trader trader = (Trader) obj;
        
        return (obj instanceof Trader) &&
                getId().equals(trader.getId()) &&
                getName().equals(trader.getName()) &&
                getGlobalId().equals(trader.getGlobalId()) &&
                getTaxId().equals(trader.getTaxId());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
}