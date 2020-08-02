public class PersonDemo {
    public static void main(String[] args) {
        Dancer one = new Dancer("Ani", "dancer", "Arevik");
        Programmer two = new Programmer("Hakob", "programmer", "Picsart");
        Singer three = new Singer("Lusine", "singer", "Samuum");


        one.setStep(3000);
        one.setDanceType("salsa");
        one.all();
        System.out.println();

        two.setStep(2500);
        two.all();
        System.out.println();

        three.setStep(2000);
        three.all();
        System.out.println();

    }
}