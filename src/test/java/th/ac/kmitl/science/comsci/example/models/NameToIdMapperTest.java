package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.utilities.NameToIdMapper;
import th.ac.kmitl.science.comsci.example.models.utilities.NotFoundMappingException;
import th.ac.kmitl.science.comsci.example.models.mock.CityNameMock;

public class NameToIdMapperTest {
    
    @Test
    public void canMapCityNameToIdCorrectly() throws NotFoundMappingException{      
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.lakSi) == 
                CityNameMock.lakSiId);
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.latKrabang) == 
                CityNameMock.latKrabangId);
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.phayaThai) == 
                CityNameMock.phayaThaiId);
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.sathon) == 
                CityNameMock.sathonId);
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.watthana) == 
                CityNameMock.watthanaId);
    }
    
}
