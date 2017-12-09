package th.ac.kmitl.science.comsci.example.models.mock;

import th.ac.kmitl.science.comsci.example.models.Product;

public class ProductMock {

    public static String id = "id12345678";
    public static String globalId = "gId12345678";
    public static String name = "ASUS DUAL GTX1060 O3G";

    public static Product asusDualGTX1060() {
        return new Product(
                id,
                globalId,
                name);
    }
}
