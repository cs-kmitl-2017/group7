package th.ac.kmitl.science.comsci.example.models;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.TraderMock;
import th.ac.kmitl.science.comsci.example.models.mock.AddressMock;
import th.ac.kmitl.science.comsci.example.models.mock.UniversalCommunicationMock;

public class TraderTest {
    
    @Test
    public void createTraderObjectCorrectly(){      
        Trader traderObject = new Trader(
                TraderMock.id,
                TraderMock.name,
                TraderMock.globalId, 
                TraderMock.taxId);
        
        assert(traderObject.getName().equals(TraderMock.name));
        assert(traderObject.getGlobalId().equals(TraderMock.globalId));
        assert(traderObject.getTaxId().equals(TraderMock.taxId));
    }
    
    @Test
    public void setAttributeTraderCorrectly(){      
        Trader traderObject = TraderMock.generateTraderMock();
        
        traderObject.setName(TraderMock.newName);
        traderObject.setGlobalId(TraderMock.newGlobalId);
        traderObject.setTaxId(TraderMock.newTaxId);
        
        assert(traderObject.getName().equals(TraderMock.newName));
        assert(traderObject.getGlobalId().equals(TraderMock.newGlobalId));
        assert(traderObject.getTaxId().equals(TraderMock.newTaxId));
    }
    
    @Test
    public void canCompareNullTraderObject(){      
        Trader traderInitailObject = TraderMock.generateNullTraderMock();
        Trader traderCompareObject = TraderMock.generateNullTraderMock();
        
        assert(traderInitailObject.equals(traderCompareObject));
    }
    
    @Test
    public void canCompareEqualsTraderObject(){      
        Trader traderInitailObject = TraderMock.generateTraderMock();
        Trader traderCompareObject = TraderMock.generateTraderMock();
        
        assert(traderInitailObject.equals(traderCompareObject));
    }
    
    @Test
    public void canCompareDifferenceTraderObject(){    
        Trader traderInitailObject = TraderMock.generateTraderMock();
        Trader traderCompareObject = TraderMock.generateNewTraderMock();
        
        assertFalse(traderInitailObject.equals(traderCompareObject));
    }
    
    @Test
    public void canSetGetTraderAddressCorrectly(){
        Trader traderObject = TraderMock.generateTraderMock();      
        Address traderAddress = traderObject.getAddress();
        
        traderAddress.setPostCode(AddressMock.postCode);
        traderAddress.setBuildingName(AddressMock.buildingName);
        traderAddress.setLineOne(AddressMock.lineOne);
        traderAddress.setLineTwo(AddressMock.lineTwo);
        traderAddress.setLineThree(AddressMock.lineThree);
        traderAddress.setLineFour(AddressMock.lineFour);
        traderAddress.setLineFive(AddressMock.lineFive);
        traderAddress.setStreetName(AddressMock.streetName);
        traderAddress.setCityName(AddressMock.cityName);
        traderAddress.setCitySubDivisionName(AddressMock.citySubDivisionName);
        traderAddress.setCountryName(AddressMock.countryName);
        traderAddress.setCountrySubDivisionName(AddressMock.countrySubDivisionName);
        traderAddress.setBuildingNumber(AddressMock.buildingNumber);
        
        assert(traderAddress.getPostCode()
                .equals(AddressMock.postCode));
        assert(traderAddress.getBuildingName()
                .equals(AddressMock.buildingName));
        assert(traderAddress.getLineOne()
                .equals(AddressMock.lineOne));
        assert(traderAddress.getLineTwo()
                .equals(AddressMock.lineTwo));
        assert(traderAddress.getLineThree()
                .equals(AddressMock.lineThree));
        assert(traderAddress.getLineFour()
                .equals(AddressMock.lineFour));
        assert(traderAddress.getLineFive()
                .equals(AddressMock.lineFive));
        assert(traderAddress.getStreetName()
                .equals(AddressMock.streetName));
        assert(traderAddress.getCityName()
                .equals(AddressMock.cityName));
        assert(traderAddress.getCitySubDivisionName()
                .equals(AddressMock.citySubDivisionName));
        assert(traderAddress.getCountryName()
                .equals(AddressMock.countryName));
        assert(traderAddress.getCountrySubDivisionName()
                .equals(AddressMock.countrySubDivisionName));
        assert(traderAddress.getBuildingNumber()
                .equals(AddressMock.buildingNumber));
    }
    
    @Test
    public void canAddTraderUniversalComunication(){
        Trader traderObject = TraderMock.generateTraderMock();
        
        traderObject.getUniversalCommunication()
                .add(UniversalCommunicationMock
                        .generateUniversalCommunication());
        
        assert(traderObject.getUniversalCommunication().get(0)
                .equals(UniversalCommunicationMock
                        .generateUniversalCommunication()));
    }
     
    @Test
    public void canAddTraderUniversalComunicationByFactory(){
        Trader traderObject = TraderMock.generateTraderMock();
        
        traderObject.getUniversalCommunication()
                .add(TradeContactFactory
                .createTraderContact(UniversalCommunicationMock.uriId));  
        
        assert(traderObject.getUniversalCommunication()
                .get(0)
                .getUriId()
                .equals(UniversalCommunicationMock.uriId));
    }
    
}