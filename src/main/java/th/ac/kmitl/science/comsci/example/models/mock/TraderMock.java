package th.ac.kmitl.science.comsci.example.models.mock;

import th.ac.kmitl.science.comsci.example.models.Trader;

public class TraderMock {
    
    private static Trader traderInstanceMock;
    private static Trader newTraderInstanceMock;
    private static Trader nullTraderInstanceMock;
    
    public static String id = "PLLka112DF";
    public static String name = "Sutit Puyta";
    public static String globalId = "GGIM12345";
    public static String taxId = "TAX55612";
    
    public static String newId = "Aiika112DF";
    public static String newName = "Umnami Yuna";
    public static String newGlobalId = "NEWG556I";
    public static String newTaxId = "TAXnew111";
    
    private TraderMock(){
        
    }
    
    public static Trader generateTraderMock(){
        if(traderInstanceMock == null){
            traderInstanceMock = new Trader(
                id,
                name,
                globalId,
                taxId);
            
            return traderInstanceMock;
        }else{
            return traderInstanceMock;
        }
    }
    
    public static Trader generateNewTraderMock(){
        if(newTraderInstanceMock == null){
            newTraderInstanceMock = new Trader(
                newId,
                newName,
                newGlobalId,
                newTaxId);
            
            return newTraderInstanceMock;
        }else{
            return newTraderInstanceMock;
        }
    }
    
    public static Trader generateNullTraderMock(){
        if(nullTraderInstanceMock == null){
            nullTraderInstanceMock = new Trader(
                "",
                "",
                "",
                "");
            
            return nullTraderInstanceMock;
        }else{
            return nullTraderInstanceMock;
        }
    }
    
}