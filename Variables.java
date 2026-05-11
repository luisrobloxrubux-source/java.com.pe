public class Variables {

    public static void main(String[] args) {

        byte byteDato = 100;
        short shortDato = 1000;
        int intDato = 1_000_000;
        long longDato = 1_000_000_000_000L;

        float floatDato = 100.25f;
        double doubleDato = 2000.35;

        boolean booleanDato = true;
        char charDato = '\u0040';

        System.out.println("");

        System.out.println("Dato byte    : " + byteDato);
        System.out.println("Dato short   : " + shortDato);
        System.out.println("Dato int     : " + intDato);
        System.out.println("Dato long    : " + longDato);

        System.out.println("Dato float   : " + floatDato);
        System.out.println("Dato double  : " + doubleDato);

        System.out.println("Dato boolean : " + booleanDato);

        System.out.println("Dato char    : " + charDato);
    }
}