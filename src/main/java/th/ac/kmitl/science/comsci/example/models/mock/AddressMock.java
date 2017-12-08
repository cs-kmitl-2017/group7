package th.ac.kmitl.science.comsci.example.models.mock;

import th.ac.kmitl.science.comsci.example.models.Address;

public class AddressMock {
    
        public static String postCode = "20000";
        public static String buildingName = "Bangfore Building";
        public static String lineOne = "Burapha";
        public static String lineTwo = "Bhanmpa";
        public static String lineThree = "Soi4";   
        public static String lineFour = "";  
        public static String lineFive = "3";
        public static String streetName = "Ratwipa";
        public static String cityName = "BanBung";
        public static String citySubDivisionName = "Saksan";
        public static String countryName = "Thailand"; 
        public static String countrySubDivisionName = "Chonburi";
        public static String buildingNumber = "33/99"; 
        
        public static Address getAddressMock(){
            return new Address(
                postCode,
                buildingName,
                lineOne,
                lineTwo,
                lineThree,
                lineFour,
                lineFive,
                streetName,
                cityName,
                citySubDivisionName,
                countryName,
                countrySubDivisionName,
                buildingNumber);
        }
}
