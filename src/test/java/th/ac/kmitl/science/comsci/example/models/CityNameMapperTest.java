package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.utilities.CityNameMapper;
import th.ac.kmitl.science.comsci.example.models.utilities.NotFoundMappingException;
import th.ac.kmitl.science.comsci.example.models.mock.CityNameMock;

public class CityNameMapperTest {
    
    @Test
    public void mapNameToIdCorrectly() throws NotFoundMappingException{
        CityNameMapper cityNameMapper = new CityNameMapper();
        
        assert(cityNameMapper.map(CityNameMock.lakSi) ==
                CityNameMock.lakSiId);
        assert(cityNameMapper.map(CityNameMock.latKrabang) == 
                CityNameMock.latKrabangId);
        assert(cityNameMapper.map(CityNameMock.phayaThai) == 
                CityNameMock.phayaThaiId);
        assert(cityNameMapper.map(CityNameMock.sathon) == 
                CityNameMock.sathonId);
        assert(cityNameMapper.map(CityNameMock.watthana) == 
                CityNameMock.watthanaId);       
    }
    
}
