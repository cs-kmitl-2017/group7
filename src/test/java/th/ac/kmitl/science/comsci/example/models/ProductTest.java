package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.ProductMock;

public class ProductTest {

    @Test
    public void createProductObjectCorrectly() {
        Product productObject = new Product(
                ProductMock.id,
                ProductMock.globalId,
                ProductMock.name);

        assert (productObject.getId()
                .equals(ProductMock.id));
        assert (productObject.getGlobalId()
                .equals(ProductMock.globalId));
        assert (productObject.getName()
                .equals(ProductMock.name));
    }

    @Test
    public void canSetAttributeProduct() {
        Product productObject = new Product();

        productObject.setId(ProductMock.id);
        productObject.setGlobalId(ProductMock.globalId);
        productObject.setName(ProductMock.name);

        assert (productObject.getId()
                .equals(ProductMock.id));
        assert (productObject.getGlobalId()
                .equals(ProductMock.globalId));
        assert (productObject.getName()
                .equals(ProductMock.name));
    }
}
