public class Gold extends Member{
    public Gold(String name, double purchase){
        super(name, purchase);
    }

    @Override
    public double cal() {
        // TODO Auto-generated method stub
        return getPurchase () * .15f;
    }

}
