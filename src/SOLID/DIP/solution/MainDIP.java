package SOLID.DIP.solution;

import SOLID.DIP.solution.data.Persistence;
import SOLID.DIP.solution.data.SqlDatabase;
import SOLID.DIP.solution.domain.Fpay;
import SOLID.DIP.solution.domain.PaymentMethod;
import SOLID.DIP.solution.presentation.ShoppingBasket;

public class MainDIP {
    public static void main(String[] args) {
        PaymentMethod fpay = new Fpay();
        Persistence MySQL = new SqlDatabase();
        ShoppingBasket shoppingBasket = new ShoppingBasket(MySQL,fpay);
        shoppingBasket.buy(null);
    }
}
