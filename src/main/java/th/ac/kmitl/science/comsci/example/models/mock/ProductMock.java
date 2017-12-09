package th.ac.kmitl.science.comsci.example.models.mock;

import th.ac.kmitl.science.comsci.example.models.Product;

public class ProductMock {

    public static String id = "id12345678";
    public static String globalId = "gId12345678";
    public static String name = "Keyboard";

    public static Product getProductMock() {
        return new Product(
                id,
                globalId,
                name);
    }
}
