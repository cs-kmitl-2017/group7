package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mapper.NameToIdMapper;
import th.ac.kmitl.science.comsci.example.models.mapper.NotFoundMappingException;
import th.ac.kmitl.science.comsci.example.models.mock.CityNameMock;

public class NameToIdMapperTest {
    
    @Test
    public void canMapCityNameToIdCorrectly() throws NotFoundMappingException{      
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.cityNameLakSi) == 
                CityNameMock.cityNameLakSiId);
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.cityNameLatKrabang) == 
                CityNameMock.cityNameLatKrabangId);
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.cityNamePhayaThai) == 
                CityNameMock.cityNamePhayaThaiId);
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.cityNameSathon) == 
                CityNameMock.cityNameSathonId);
        assert(NameToIdMapper.mapCityNameToId(CityNameMock.cityNameWatthana) == 
                CityNameMock.cityNameWatthanaId);
    }
    
}
