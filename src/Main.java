import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList();

        System.out.print("Enter the number of the product: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            if (ch == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(name, price));

            } else if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
                sc.nextLine();
            } else if (ch == 'u') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = dateFormat.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
                sc.nextLine();
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        System.out.println();
        for (Product product : list) {
            System.out.println(product);
        }

        sc.close();
    }

}

