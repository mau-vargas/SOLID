package SOLID.DIP.solution.presentation;

import SOLID.DIP.problem.Shopping;
import SOLID.DIP.solution.data.Persistence;
import SOLID.DIP.solution.domain.PaymentMethod;

public class ShoppingBasket {

    private final Persistence persistence;
    private final PaymentMethod paymentMethod;

    public ShoppingBasket(Persistence persistence, PaymentMethod paymentMethod) {
        this.persistence = persistence;
        this.paymentMethod = paymentMethod;
    }

    public void buy(Shopping shopping) {
        persistence.save(shopping);
        paymentMethod.pay(shopping);
    }

}
