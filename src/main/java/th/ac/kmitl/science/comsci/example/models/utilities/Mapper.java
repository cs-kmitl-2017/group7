package th.ac.kmitl.science.comsci.example.models.utilities;

public interface Mapper {
    
    public int map(String name) throws NotFoundMappingException;
    
}
