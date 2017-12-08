package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.AddressMock;

public class AddressTest {
    
    @Test
    public void createAddressObjectCorrectly(){
        Address addressObject = new Address(
                AddressMock.postCode,
                AddressMock.buildingName,
                AddressMock.lineOne,
                AddressMock.lineTwo,
                AddressMock.lineThree,
                AddressMock.lineFour,
                AddressMock.lineFive,
                AddressMock.streetName,
                AddressMock.cityName,
                AddressMock.citySubDivisionName,
                AddressMock.countryName,
                AddressMock.countrySubDivisionName,
                AddressMock.buildingNumber);
        
        assert(addressObject.getPostCode()
                .equals(AddressMock.postCode));
        assert(addressObject.getBuildingName()
                .equals(AddressMock.buildingName));
        assert(addressObject.getLineOne()
                .equals(AddressMock.lineOne));
        assert(addressObject.getLineTwo()
                .equals(AddressMock.lineTwo));
        assert(addressObject.getLineThree()
                .equals(AddressMock.lineThree));
        assert(addressObject.getLineFour()
                .equals(AddressMock.lineFour));
        assert(addressObject.getLineFive()
                .equals(AddressMock.lineFive));
        assert(addressObject.getStreetName()
                .equals(AddressMock.streetName));
        assert(addressObject.getCityName()
                .equals(AddressMock.cityName));
        assert(addressObject.getCitySubDivisionName()
                .equals(AddressMock.citySubDivisionName));
        assert(addressObject.getCountryName()
                .equals(AddressMock.countryName));
        assert(addressObject.getCountrySubDivisionName()
                .equals(AddressMock.countrySubDivisionName));
        assert(addressObject.getBuildingNumber()
                .equals(AddressMock.buildingNumber));
    }
    
    @Test
    public void canSetAttributeAddress(){      
        Address addressObject = AddressMock.generateAddressMock();
        
        addressObject.setPostCode(AddressMock.postCode);
        addressObject.setBuildingName(AddressMock.buildingName);
        addressObject.setLineOne(AddressMock.lineOne);
        addressObject.setLineTwo(AddressMock.lineTwo);
        addressObject.setLineThree(AddressMock.lineThree);
        addressObject.setLineFour(AddressMock.lineFour);
        addressObject.setLineFive(AddressMock.lineFive);
        addressObject.setStreetName(AddressMock.streetName);
        addressObject.setCityName(AddressMock.cityName);
        addressObject.setCitySubDivisionName(AddressMock.citySubDivisionName);
        addressObject.setCountryName(AddressMock.countryName);
        addressObject.setCountrySubDivisionName(AddressMock.countrySubDivisionName);
        addressObject.setBuildingNumber(AddressMock.buildingNumber);

        assert(addressObject.getPostCode()
                .equals(AddressMock.postCode));
        assert(addressObject.getBuildingName()
                .equals(AddressMock.buildingName));
        assert(addressObject.getLineOne()
                .equals(AddressMock.lineOne));
        assert(addressObject.getLineTwo()
                .equals(AddressMock.lineTwo));
        assert(addressObject.getLineThree()
                .equals(AddressMock.lineThree));
        assert(addressObject.getLineFour()
                .equals(AddressMock.lineFour));
        assert(addressObject.getLineFive()
                .equals(AddressMock.lineFive));
        assert(addressObject.getStreetName()
                .equals(AddressMock.streetName));
        assert(addressObject.getCityName()
                .equals(AddressMock.cityName));
        assert(addressObject.getCitySubDivisionName()
                .equals(AddressMock.citySubDivisionName));
        assert(addressObject.getCountryName()
                .equals(AddressMock.countryName));
        assert(addressObject.getCountrySubDivisionName()
                .equals(AddressMock.countrySubDivisionName));
        assert(addressObject.getBuildingNumber()
                .equals(AddressMock.buildingNumber));
    }
}
