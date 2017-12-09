package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.utilities.CityCodeMapper;
import th.ac.kmitl.science.comsci.example.models.utilities.NotFoundMappingException;
import th.ac.kmitl.science.comsci.example.models.mock.CityCodeMapperMock;

public class CityCodeMapperTest {
    
    @Test
    public void mapNameToIdCorrectly() throws NotFoundMappingException{
        CityCodeMapper cityNameMapper = new CityCodeMapper();
        
        assert(cityNameMapper.map(CityCodeMapperMock.lakSi) ==
                CityCodeMapperMock.lakSiId);
        assert(cityNameMapper.map(CityCodeMapperMock.latKrabang) == 
                CityCodeMapperMock.latKrabangId);
        assert(cityNameMapper.map(CityCodeMapperMock.phayaThai) == 
                CityCodeMapperMock.phayaThaiId);
        assert(cityNameMapper.map(CityCodeMapperMock.sathon) == 
                CityCodeMapperMock.sathonId);
        assert(cityNameMapper.map(CityCodeMapperMock.watthana) == 
                CityCodeMapperMock.watthanaId);       
    }
    
}
