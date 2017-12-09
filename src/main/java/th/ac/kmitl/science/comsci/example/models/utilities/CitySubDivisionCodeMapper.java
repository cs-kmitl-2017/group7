package th.ac.kmitl.science.comsci.example.models.utilities;

public class CitySubDivisionCodeMapper implements Mapper{

    @Override
    public int map(String name) throws NotFoundMappingException {
        switch(name){         
            case "ลาดกระบัง":     
                return 101101;              
            case "คลองสองต้นนุ่น":     
                return 101102;              
            case "คลองสามประเวศ":   
                return 101103;             
            case "ลำปลาทิว":     
                return 101104;             
            case "ทับยาว":       
                return 101105;            
            case "ขุมทอง":      
                return 101106;             
            default : 
                throw new NotFoundMappingException(
                        "City Sub-Division name to map is not found"); 
        }
    }
    
}