package th.ac.kmitl.science.comsci.example.models.mapper;

public class CityNameMapper implements Mapper{
    
    @Override
    public int map(String dataToMap) throws NotFoundMappingException{
        
        switch(dataToMap){
            
            case "คลองเตย":     
                return 1033;              
            case "คลองสาน":     
                return 1018;              
            case "คลองสามวา":   
                return 1046;             
            case "คันนายาว":     
                return 1043;             
            case "จตุจักร":       
                return 1030;            
            case "จอมทอง":      
                return 1035;             
            case "ดอนเมือง":     
                return 1036;             
            case "ดินแดง":       
                return 1026;             
            case "ดุสิต":         
                return 1002;            
            case "ตลิ่งชัน":       
                return 1019;            
            case "ทวีวัฒนา":      
                return 1048;              
            case "ทุ่งครุ":        
                return 1047;             
            case "ธนบุรี":        
                return 1015;                 
            case "บางกอกน้อย":   
                return 1020;          
            case "บางกอกใหญ่":   
                return 1016;                
            case "บางกะปิ":      
                return 1006;               
            case "บางขุนเทียน":   
                return 1021;               
            case "บางเขน":      
                return 1005;              
            case "บางคอแหลม":   
                return 1031;              
            case "บางแค":       
                return 1040;            
            case "บางซื่อ":       
                return 1029;               
            case "บางนา":       
                return 1047;           
            case "บางบอน":      
                return 1050;               
            case "บางพลัด":      
                return 1025;               
            case "บางรัก":       
                return 1004;             
            case "บึงกุ่ม":        
                return 1027;              
            case "ประเวศ": 
                return 1032;              
            case "ปทุมวัน": 
                return 1007;             
            case "ป้อมปราบศัตรูพ่าย": 
                return 1008;            
            case "พญาไท": 
                return 1014;            
            case "พระโขนง": 
                return 1009;           
            case "พระนคร": 
                return 1001;           
            case "ภาษีเจริญ": 
                return 1022;           
            case "มีนบุรี": 
                return 1010;            
            case "ยานนาวา": 
                return 1012;           
            case "ราษฎร์บูรณะ": 
                return 1024;           
            case "ลาดกระบัง": 
                return 1011;             
            case "ลาดพร้าว": 
                return 1038;               
            case "วังทองหลาง": 
                return 1045;             
            case "วัฒนา": 
                return 1039;             
            case "สวนหลวง": 
                return 1034;            
            case "สะพานสูง": 
                return 1044;           
            case "สัมพันธวงศ์": 
                return 1013;                
            case "สาทร": 
                return 1028;                
            case "สายไหม": 
                return 1042;               
            case "หนองแขม": 
                return 1023;                
            case "หนองจอก": 
                return 1003;                
            case "หลักสี่": 
                return 1041;               
            case "ห้วยขวาง": 
                return 1017;           
            default : 
                throw new NotFoundMappingException("Not found city name to map");
        }
    }
}
