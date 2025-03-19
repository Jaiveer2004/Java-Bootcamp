package e_PrinciplesOfOOPS.Properties.inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    public BoxPrice(double l, double b, double h, double w, double cost) {
        super(l, b, h, w);
        this.cost = cost;
    }
}

// This class contains all the information about Box and BoxWeight
