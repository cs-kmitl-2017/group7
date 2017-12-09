package th.ac.kmitl.science.comsci.example.models.mapper;

public class NameToIdMapper {

    private static CityNameMapper cityNameMapper;
    
    private NameToIdMapper() {
        
    }
    
    public static int mapCityNameToId(String cityName) 
            throws NotFoundMappingException{
        if(cityNameMapper == null){
            cityNameMapper = new CityNameMapper();
            return cityNameMapper.map(cityName);
        }else{
            return cityNameMapper.map(cityName);
        }
    }
    
}