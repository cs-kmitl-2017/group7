package th.ac.kmitl.science.comsci.example.models;

public class UniversalCommunication{
    
    private String uriId;

    public String getUriId() {
        return uriId;
    }

    public void setUriId(String uriId) {
        this.uriId = uriId;
    }
    
    public UniversalCommunication(String uriId){
        setUriId(uriId);
    }
    
    @Override
    public boolean equals(Object obj) {
        UniversalCommunication other = (UniversalCommunication) obj;
        
        return (obj instanceof UniversalCommunication) && getUriId().equals(other.getUriId());      
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
}