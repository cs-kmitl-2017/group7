package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class TraderTest {
    
    @Test
    public void creatTraderObjectCorrectly(){
        String name = "Sutit Puyta";
        String globalId = "GGIM12345";
        String taxId = "TAX55612";
        String uriId = "URI665H16";
        
        Trader traderObject = new Trader(name, globalId, taxId, uriId);
        
        assert(traderObject.getName().equals(name));
        assert(traderObject.getGlobalId().equals(globalId));
        assert(traderObject.getTaxId().equals(taxId));
        assert(traderObject.getUriId().equals(uriId));
    }
    
    @Test
    public void setAttributeTraderCorrectly(){
        String name = "Sutit Puyta";
        String globalId = "GGIM12345";
        String taxId = "TAX55612";
        String uriId = "URI665H16";
        
        String newName = "Umnami Yuna";
        String newGlobalId = "NEWG556I";
        String newTaxId = "TAXnew111";
        String newUriId = "UNew664ee";
        
        Trader traderObject = new Trader(name, globalId, taxId, uriId);
        
        traderObject.setName(newName);
        traderObject.setGlobalId(newGlobalId);
        traderObject.setTaxId(newTaxId);
        traderObject.setUriId(newUriId);
        
        assert(traderObject.getName().equals(newName));
        assert(traderObject.getGlobalId().equals(newGlobalId));
        assert(traderObject.getTaxId().equals(newTaxId));
        assert(traderObject.getUriId().equals(newUriId));
    }
    
    @Test
    public void canCompareNullTraderObject(){
        String name = "";
        String globalId = "";
        String taxId = "";
        String uriId = "";
        
        Trader traderInitailObject = new Trader(name, globalId, taxId, uriId);
        Trader traderCompareObject = new Trader(name, globalId, taxId, uriId);
        
        assert(traderInitailObject.equals(traderCompareObject));
    }
    
    @Test
    public void canCompareEqualsTraderObject(){
        String name = "Sutit Puyta";
        String globalId = "GGIM12345";
        String taxId = "TAX55612";
        String uriId = "URI665H16";
        
        Trader traderInitailObject = new Trader(name, globalId, taxId, uriId);
        Trader traderCompareObject = new Trader(name, globalId, taxId, uriId);
        
        assert(traderInitailObject.equals(traderCompareObject));
    }
    
}
