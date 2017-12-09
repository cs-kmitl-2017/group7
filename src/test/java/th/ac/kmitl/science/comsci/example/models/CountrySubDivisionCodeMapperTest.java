package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.utilities.NotFoundMappingException;
import th.ac.kmitl.science.comsci.example.models.utilities.CountrySubDivisionCodeMapper;

public class CountrySubDivisionCodeMapperTest {

    @Test
    public void countrySubDivisionCodeMapperCorrectly() throws NotFoundMappingException {
        CountrySubDivisionCodeMapper countrySubDivisionCodeMapper
                = new CountrySubDivisionCodeMapper();

        assert (countrySubDivisionCodeMapper.map("ขอนแก่น") == 6);
        assert (countrySubDivisionCodeMapper.map("นนทบุรี") == 24);
        assert (countrySubDivisionCodeMapper.map("พังงา") == 34);
        assert (countrySubDivisionCodeMapper.map("ราชบุรี") == 51);
    }

}
