package week18;

public class Father extends Parent implements Worker{
    @Override
    public void raiseKid() {
        System.out.println("Raising Kids, helping moms");
    }

    @Override
    public void plaWithKid() {
        System.out.println("PLaying with kids occasionally");
    }

    @Override
    public void feedKid() {
        System.out.println("Providing Food and suplies to home");
    }

    @Override
    public void work(String job) {
        System.out.println("working as a"+job);
    }

    @Override
    public double getPaid() {
        return 0;
    }
}
