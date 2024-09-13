public class Silvy extends Member{
public Silvy (String name, double purchase){
    super(name, purchase);
}

@Override
public double cal() {
    // TODO Auto-generated method stub
    return super.getPurchase()*.10d;
}
}
