package th.ac.kmitl.science.comsci.example.models;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.UniversalCommunicationMock;

public class UniversalCommunicationTest {
    
    @Test
    public void createUniversalCommunicationObjectCorrectly(){
        UniversalCommunication universalCommunication = 
                new UniversalCommunication(UniversalCommunicationMock.uriId);
        
        assert(universalCommunication.getUriId()
                .equals(UniversalCommunicationMock.uriId));
    }
    
    @Test
    public void setUriIdUniversalCommunicationOjectCorrectly(){
        UniversalCommunication initailCommunication = 
                UniversalCommunicationMock.getUniversalCommunication();
        
        UniversalCommunication newCommunication = 
                UniversalCommunicationMock.getNewUniversalCommunication();
        
        assertFalse(initailCommunication.equals(newCommunication));
    }
    
    @Test
    public void canCompareUniversalCommunicationOject(){
        UniversalCommunication initailCommunication = 
                UniversalCommunicationMock.getUniversalCommunication();
        
        UniversalCommunication compareCommunication = 
                UniversalCommunicationMock.getUniversalCommunication();
        
        assert(initailCommunication.equals(compareCommunication));
    }
}
