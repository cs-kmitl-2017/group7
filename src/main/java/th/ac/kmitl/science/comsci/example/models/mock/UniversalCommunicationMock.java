package th.ac.kmitl.science.comsci.example.models.mock;

import th.ac.kmitl.science.comsci.example.models.UniversalCommunication;

public class UniversalCommunicationMock {
    
    private static UniversalCommunication 
            universalCommunicationInstanceMock;
    private static UniversalCommunication
            newUniversalCommunicationInstanceMock;
    
    private UniversalCommunicationMock(){
        
    }
    
    public static String uriId = "uniMail@GGmail.com";
    public static String newUriId = "newMail@GGmail.com";
    
    public static UniversalCommunication generateUniversalCommunication(){
        if(universalCommunicationInstanceMock == null){
            universalCommunicationInstanceMock = 
                    new UniversalCommunication(uriId);
            
            return universalCommunicationInstanceMock;
        }else{
            return universalCommunicationInstanceMock;
        }
        
    }
    
    public static UniversalCommunication generateNewUniversalCommunication(){
        if(newUniversalCommunicationInstanceMock == null){
            newUniversalCommunicationInstanceMock = 
                    new UniversalCommunication(newUriId);
            
            return newUniversalCommunicationInstanceMock;
        }else{
            return newUniversalCommunicationInstanceMock;
        }
    }
    
}
