package SOLID.DIP.solution.domain;

import SOLID.DIP.problem.Shopping;

public interface PaymentMethod {
    void pay(Shopping shopping);
}
