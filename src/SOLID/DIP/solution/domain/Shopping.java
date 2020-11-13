package SOLID.DIP.solution.domain;

import SOLID.DIP.problem.Product;

import java.util.ArrayList;

public class Shopping {

    public ArrayList<SOLID.DIP.problem.Product> product;

    public ArrayList<SOLID.DIP.problem.Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
}
