package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mock.ProductMock;

public class ProductTest {

    @Test
    public void createProductCorrectly() {
        Product product = new Product(
                ProductMock.id,
                ProductMock.globalId,
                ProductMock.name);
        
        assert (product.getId()
                .equals(ProductMock.id));
        assert (product.getGlobalId()
                .equals(ProductMock.globalId));
        assert (product.getName()
                .equals(ProductMock.name));
    }

    @Test
    public void canSetAttributeProduct() {
        Product product = new Product();
        Product asusDualGTX1060 = ProductMock.asusDualGTX1060();
        
        product.setId(asusDualGTX1060.getId());
        product.setGlobalId(asusDualGTX1060.getGlobalId());
        product.setName(asusDualGTX1060.getName());

        assert (product.getId()
                .equals(asusDualGTX1060.getId()));
        assert (product.getGlobalId()
                .equals(asusDualGTX1060.getGlobalId()));
        assert (product.getName()
                .equals(asusDualGTX1060.getName()));
    }
}
