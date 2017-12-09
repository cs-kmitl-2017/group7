package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.utilities.CitySubDivisionCodeMapper;
import th.ac.kmitl.science.comsci.example.models.utilities.NotFoundMappingException;

public class CitySubDivisionCodeMapperTest {
    
    @Test
    public void mapSubDivisionToCodeCorrectly() throws NotFoundMappingException{
        CitySubDivisionCodeMapper citySubDivisionCodeMapper = 
                new CitySubDivisionCodeMapper();
        
        assert(citySubDivisionCodeMapper.map("ลาดกระบัง") == 101101);
        assert(citySubDivisionCodeMapper.map("คลองสองต้นนุ่น") == 101102);
        assert(citySubDivisionCodeMapper.map("คลองสามประเวศ") == 101103);
        assert(citySubDivisionCodeMapper.map("ลำปลาทิว") == 101104);
        assert(citySubDivisionCodeMapper.map("ทับยาว") == 101105);
        assert(citySubDivisionCodeMapper.map("ขุมทอง") == 101106);
    }
    
    @Test(expected = NotFoundMappingException.class)
    public void throwExceptionCorrectly () throws NotFoundMappingException{
        CitySubDivisionCodeMapper citySubDivisionCodeMapper =
                    new CitySubDivisionCodeMapper();
        
        citySubDivisionCodeMapper.map("ช่องนนทรี");       
    }
    
}