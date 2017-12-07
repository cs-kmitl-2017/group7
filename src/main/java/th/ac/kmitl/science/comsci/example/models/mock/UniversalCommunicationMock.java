package th.ac.kmitl.science.comsci.example.models.mock;

import th.ac.kmitl.science.comsci.example.models.UniversalCommunication;

public class UniversalCommunicationMock {
    
    public static String uriId = "uniMail@GGmail.com";
    public static String newUriId = "newMail@GGmail.com";
    
    public static UniversalCommunication getUniversalCommunication(){
        return new UniversalCommunication(uriId);
    }
    
    public static UniversalCommunication getNewUniversalCommunication(){
        return new UniversalCommunication(newUriId);
    }
}
