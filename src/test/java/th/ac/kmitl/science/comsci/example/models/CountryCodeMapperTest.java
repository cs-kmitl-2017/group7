package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.utilities.CountryCodeMapper;
import th.ac.kmitl.science.comsci.example.models.utilities.NotFoundMappingException;
import th.ac.kmitl.science.comsci.example.models.mock.CountryCodeMapperMock;

public class CountryCodeMapperTest {

    @Test
    public void mapNameToIdCorrectly() throws NotFoundMappingException{
        CountryCodeMapper countryCodeMapper = new CountryCodeMapper();

        assert(countryCodeMapper.map(CountryCodeMapperMock.america) ==
                CountryCodeMapperMock.americaId);
        assert(countryCodeMapper.map(CountryCodeMapperMock.korea) ==
                CountryCodeMapperMock.koreaId);
        assert(countryCodeMapper.map(CountryCodeMapperMock.thai) ==
                CountryCodeMapperMock.thaiId);
    }

}
