public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("Added to My sql");
    }
}
//Classes can be implements more than one Interface but cannot extend more than one class or also abstract class