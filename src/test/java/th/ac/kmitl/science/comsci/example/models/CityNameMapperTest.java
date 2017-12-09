package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mapper.CityNameMapper;
import th.ac.kmitl.science.comsci.example.models.mapper.NotFoundMappingException;
import th.ac.kmitl.science.comsci.example.models.mock.CityNameMock;

public class CityNameMapperTest {
    
    @Test
    public void mapNameToIdCorrectly() throws NotFoundMappingException{
        CityNameMapper cityNameMapper = new CityNameMapper();
        
        assert(cityNameMapper.map(CityNameMock.cityNameLakSi) ==
                CityNameMock.cityNameLakSiId);
        assert(cityNameMapper.map(CityNameMock.cityNameLatKrabang) == 
                CityNameMock.cityNameLatKrabangId);
        assert(cityNameMapper.map(CityNameMock.cityNamePhayaThai) == 
                CityNameMock.cityNamePhayaThaiId);
        assert(cityNameMapper.map(CityNameMock.cityNameSathon) == 
                CityNameMock.cityNameSathonId);
        assert(cityNameMapper.map(CityNameMock.cityNameWatthana) == 
                CityNameMock.cityNameWatthanaId);       
    }
    
}
