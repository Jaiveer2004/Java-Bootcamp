package e_PrinciplesOfOOPS.Properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double b, double h, double w) {
        super(l, b, h); // Used to call the constructor of the parent class.
        // But it can't access the member variables that are private in parent class.

        this.weight = w;
    }

}

// This class contains all the information about Box

