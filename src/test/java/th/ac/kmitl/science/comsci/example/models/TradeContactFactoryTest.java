package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.UniversalCommunicationMock;

public class TradeContactFactoryTest {
    
    @Test
    public void createUniversalCommunicationObjectCorrectly(){
        UniversalCommunication universalCommunication = TradeContactFactory
                .createTraderContact(UniversalCommunicationMock.uriId);
        
        assert(universalCommunication instanceof UniversalCommunication);
    }
    
    @Test
    public void createObjectAndSetAttributeUriIdCorrectly(){
        UniversalCommunication universalCommunication = TradeContactFactory
                .createTraderContact(UniversalCommunicationMock.uriId);
        
        assert(universalCommunication.getUriId()
                .equals(UniversalCommunicationMock.uriId));
    }
    
}
