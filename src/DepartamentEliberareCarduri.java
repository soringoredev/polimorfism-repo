public class DepartamentEliberareCarduri {
    public static void main(String[] args) {

        VictoriaBankCarduri cardPersoanaFizica001 = new VictoriaBankCarduri(500.0);
        VictoriaBankCarduri cardPersoanaFizica002 = new VictoriaBankCarduri(500.0);

        VictoriaBankCarduri cardPersoanaFizica003 = new VictoriaBankCarduri();
        System.out.println(cardPersoanaFizica003.baniCard);

        System.out.println(cardPersoanaFizica001.baniCard);
        System.out.println(cardPersoanaFizica002.baniCard);

    }
}
