public class OCP {
}


class DiscountCalculator {
    double calculate(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.9;
        } else if (customerType.equals("Premium")) {
            return amount * 0.8;
        } else if (customerType.equals("VIP")) {
            return amount * 0.7;
        }
        return amount;
    }
}

// ----------------------------------------------------------------------

interface Customer{
    int  discountCalcultor();
}

class Regular implements Customer{
    private final int amount;
    final double DISCOUNT = 0.9;

    Regular(int amount){
        this.amount=amount;
    }

    @Override
    public int discountCalcultor(){
        return (int) (amount * DISCOUNT);
    }
}

class Premium implements Customer{
    private final int amount;
    final double DISCOUNT = 0.8;

    Premium(int amount){
        this.amount=amount;
    }

    @Override
    public int discountCalcultor(){
        return (int) (amount * DISCOUNT);
    }
}

class VIP implements Customer{
    private final int amount;
    final double DISCOUNT = 0.7;

    VIP(int amount){
        this.amount=amount;
    }

    @Override
    public int discountCalcultor(){
        return (int) (amount * DISCOUNT);
    }
}


