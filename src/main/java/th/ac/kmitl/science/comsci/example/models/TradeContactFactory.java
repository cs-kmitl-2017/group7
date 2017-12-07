package th.ac.kmitl.science.comsci.example.models;

public class TradeContactFactory {
    
    public static TradeContact createTraderContact(String uriId){
        return new UniversalCommunication(uriId);
    }
    
}
