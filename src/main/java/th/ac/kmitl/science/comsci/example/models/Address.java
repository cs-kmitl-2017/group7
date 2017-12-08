package th.ac.kmitl.science.comsci.example.models;

public class Address {
    
    private String postCode;
    private String buildingName;
    private String lineOne;
    private String lineTwo;
    private String lineThree;   
    private String lineFour;  
    private String lineFive;
    private String streetName;
    private String cityName;
    private String citySubDivisionName;
    private String countryName; 
    private String countrySubDivisionName;
    private String buildingNumber;
    
    public Address(){
        
    }

    public Address(String postCode, 
                   String buildingName, 
                   String lineOne, 
                   String lineTwo, 
                   String lineThree, 
                   String lineFour, 
                   String lineFive, 
                   String streetName, 
                   String cityName, 
                   String citySubDivisionName, 
                   String countryName, 
                   String countrySubDivisionName, 
                   String buildingNumber) {
        this.postCode = postCode;
        this.buildingName = buildingName;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.lineThree = lineThree;
        this.lineFour = lineFour;
        this.lineFive = lineFive;
        this.streetName = streetName;
        this.cityName = cityName;
        this.citySubDivisionName = citySubDivisionName;
        this.countryName = countryName;
        this.countrySubDivisionName = countrySubDivisionName;
        this.buildingNumber = buildingNumber;
    }
    
    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCountrySubDivisionName() {
        return countrySubDivisionName;
    }

    public void setCountrySubDivisionName(String countrySubDivisionName) {
        this.countrySubDivisionName = countrySubDivisionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryId) {
        this.countryName = countryId;
    }

    public String getCitySubDivisionName() {
        return citySubDivisionName;
    }

    public void setCitySubDivisionName(String citySubDivisionName) {
        this.citySubDivisionName = citySubDivisionName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getLineFive() {
        return lineFive;
    }

    public void setLineFive(String lineFive) {
        this.lineFive = lineFive;
    }

    public String getLineFour() {
        return lineFour;
    }

    public void setLineFour(String lineFour) {
        this.lineFour = lineFour;
    }

    public String getLineThree() {
        return lineThree;
    }

    public void setLineThree(String lineThree) {
        this.lineThree = lineThree;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

}
