import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float armutFiyat = 2.14f, elmaFiyat = 3.67f, domatesFiyat = 1.11f, muzFiyat = 0.95f, patlicanFiyat = 5;

        float armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        System.out.print("Kaç kilogram armut aldınız? : ");
        armutKg = input.nextFloat();

        System.out.print("Kaç kilogram elma aldınız? : ");
        elmaKg = input.nextFloat();

        System.out.print("Kaç kilogram domates aldınız? : ");
        domatesKg = input.nextFloat();

        System.out.print("Kaç kilogram muz aldınız? : ");
        muzKg = input.nextFloat();

        System.out.print("Kaç kilogram patlıcan aldınız? : ");
        patlicanKg = input.nextFloat();

        double toplamTutar = (armutFiyat * armutKg) + (elmaFiyat * elmaKg) +
                (domatesFiyat * domatesKg) + (muzFiyat * muzKg) +
                (patlicanFiyat * patlicanKg);

        System.out.printf("Toplam tutar: %.2f TL", toplamTutar);
    }
}