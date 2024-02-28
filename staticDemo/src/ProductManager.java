public class ProductManager {
    public void add(Product product){

        if (ProductValidator.isValid(product)) {
            System.out.println("Product successfully added");
        }else {
            System.out.println("Product info is not enough");
        }
    }
    ProductValidator productValidator = new ProductValidator();

}
