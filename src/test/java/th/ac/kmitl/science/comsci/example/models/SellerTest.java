package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class SellerTest {
    
    @Test
    public void creatSellerObjectCorrectly(){
        String name = "Sutit Puyta";
        String globalId = "GGIM12345";
        String taxId = "TAX55612";
        String uriId = "URI665H16";
        String email = "email@testmail.com";
        
        Seller sellerObject = new Seller(name, globalId, taxId, uriId, email);
        
        assert(sellerObject.getName().equals(name));
        assert(sellerObject.getGlobalId().equals(globalId));
        assert(sellerObject.getTaxId().equals(taxId));
        assert(sellerObject.getUriId().equals(uriId));
        assert(sellerObject.getEmail().equals(email));
    }
    
    @Test
    public void setAttributeSellerCorrectly(){
        String name = "Sutit Puyta";
        String globalId = "GGIM12345";
        String taxId = "TAX55612";
        String uriId = "URI665H16";
        String email = "email@testmail.com";
        
        String newName = "Umnami Yuna";
        String newGlobalId = "NEWG556I";
        String newTaxId = "TAXnew111";
        String newUriId = "UNew664ee";
        String newEmail = "newEmail@testmail.com";
        
        Seller sellerObject = new Seller(name, globalId, taxId, uriId, email);
        
        sellerObject.setName(newName);
        sellerObject.setGlobalId(newGlobalId);
        sellerObject.setTaxId(newTaxId);
        sellerObject.setUriId(newUriId);
        sellerObject.setEmail(newEmail);
        
        assert(sellerObject.getName().equals(newName));
        assert(sellerObject.getGlobalId().equals(newGlobalId));
        assert(sellerObject.getTaxId().equals(newTaxId));
        assert(sellerObject.getUriId().equals(newUriId));
        assert(sellerObject.getEmail().equals(newEmail));
    }
    
    @Test
    public void canCompareNullSellerObject(){
        String name = "";
        String globalId = "";
        String taxId = "";
        String uriId = "";
        String email = "";
        
        Seller sellerObj = new Seller(name, globalId, taxId, uriId, email);
        Seller sellerCompareObj = new Seller(name, globalId, taxId, uriId, email);
        
        assert(sellerObj.equals(sellerCompareObj));
    }
    
    @Test
    public void canCompareEqualsSellerObject(){
        String name = "Sutit Puyta";
        String globalId = "GGIM12345";
        String taxId = "TAX55612";
        String uriId = "URI665H16";
        String email = "email@testmail.com";
        
        Seller sellerInitailObj = new Seller(name, globalId, taxId, uriId, email);
        Seller sellerCompareObj = new Seller(name, globalId, taxId, uriId, email);
        
        assert(sellerInitailObj.equals(sellerCompareObj));
    }
    
}
