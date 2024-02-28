public class ProductValidator {
    static {
        System.out.println("Static constructor execute");
    }
    public ProductValidator() {
        System.out.println("Constructor execute");
    }
    public static boolean isValid(Product product){
        if (product.price>0&&!product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public void something(){};

    //Inner class
    public static class anotherClass{
        public static void delete(){

        }
    }
}
