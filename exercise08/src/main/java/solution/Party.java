package solution;

public class Party {
    private int people;
    private int pizzas;
    private int totalSlices;

    public Party(int people, int pizzas, int slices) {
        this.people = people;
        this.pizzas = pizzas;
        this.totalSlices = pizzas * slices;
    }

    public void getTotalSlices() {
        System.out.printf("%d people with %d pizzas (%d slices)", people, pizzas , totalSlices);
    }

    public void getSlicesPerPerson() {
        int result = totalSlices / people;
        System.out.printf("%nEach person gets %d pieces of pizza.", result);
    }

    public void getLeftovers() {
        int result = totalSlices % people;
        System.out.printf("%nThere are %d leftover pieces.", result);
    }
}
