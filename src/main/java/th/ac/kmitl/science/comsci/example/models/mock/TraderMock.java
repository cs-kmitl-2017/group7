package th.ac.kmitl.science.comsci.example.models.mock;

import th.ac.kmitl.science.comsci.example.models.Trader;

public class TraderMock {
    
    public static String name = "Sutit Puyta";
    public static String globalId = "GGIM12345";
    public static String taxId = "TAX55612";
    public static String uriId = "URI665H16";
    
    public static String newName = "Umnami Yuna";
    public static String newGlobalId = "NEWG556I";
    public static String newTaxId = "TAXnew111";
    public static String newUriId = "UNew664ee";
    
    public static Trader getTraderMock(){
        return new Trader(
                name,
                globalId,
                taxId,
                uriId
        );
    }
    
    public static Trader getNewTraderMock(){
        return new Trader(
                newName,
                newGlobalId,
                newTaxId,
                newUriId
        );
    }
    
    public static Trader getNullTraderMock(){
        return new Trader(
                "",
                "",
                "",
                ""
        );
    }
}
