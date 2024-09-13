public class Diamond extends Member{
    public Diamond(String name, double purchase){
        super(name, purchase);
    }

    @Override
    public double cal() {
        // TODO Auto-generated method stub
        return getPurchase() * .50d;
    }

}
