package th.ac.kmitl.science.comsci.example.models;

public class UniversalCommunication extends TradeContact{
    
    public UniversalCommunication(String uriId){
        setUriId(uriId);
    }
    
    @Override
    public boolean equals(Object obj) {
        TradeContact other = (TradeContact) obj;
        
        return (obj instanceof TradeContact) && getUriId().equals(other.getUriId());      
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
}