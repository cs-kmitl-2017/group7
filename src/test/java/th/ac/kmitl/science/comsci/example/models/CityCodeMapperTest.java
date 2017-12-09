package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.utilities.CityCodeMapper;
import th.ac.kmitl.science.comsci.example.models.utilities.NotFoundMappingException;

public class CityCodeMapperTest {
    
    @Test
    public void mapNameToIdCorrectly() throws NotFoundMappingException{
        CityCodeMapper cityCodeMapper = new CityCodeMapper();
        
        assert(cityCodeMapper.map("หลักสี่") == 1041);
        assert(cityCodeMapper.map("ลาดกระบัง") == 1011);
        assert(cityCodeMapper.map("พญาไท") == 1014);
        assert(cityCodeMapper.map("สาทร") == 1028);
        assert(cityCodeMapper.map("วัฒนา") == 1039);       
    }
    
}