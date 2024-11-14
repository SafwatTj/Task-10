/*
Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д. Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и, в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).

 */


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("banana", new BigDecimal("1.4"), 8.3, 100),
                new Product("orange", new BigDecimal("1.8"), 7.5, 80),
                new Product("milk", new BigDecimal("0.99"), 8.7, 30),
                new Product("apple", new BigDecimal("2.2"), 9.1, 70),
                new Product("pineapple", new BigDecimal("3.4"), 6.1, 70)
        );
        printProducts(products);

        Comparator<Product> comparator=null;
        do {
            comparator = selectSortType();
            if (comparator != null) {
                printProducts(getSortedList(products, comparator));
            }
        } while (comparator!=null);
    }

    public static Comparator<Product> selectSortType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер сортировки списка: ");
        System.out.println("1. по названию ");
        System.out.println("2. по цене ");
        System.out.println("3. по рейтингу ");
        System.out.println("4. по количеству ");
        System.out.println("5. по названию (в обратном порядке)");
        System.out.println("6. по цене (в обратном порядке)");
        System.out.println("7. по рейтингу (в обратном порядке)");
        System.out.println("8. по количеству (в обратном порядке)");

        System.out.println("любая другая цифра - выход");
        int select = scanner.nextInt();
        switch (select){
            case 1: return new ComparatorProductsByTitle();
            case 2: return new ComparatorProductsByPrice();
            case 3: return new ComparatorProductsByRating();
            case 4: return new ComparatorProductsByQuantity();
            case 5: return new ComparatorProductsByTitle().reversed();
            case 6: return new ComparatorProductsByPrice().reversed();
            case 7: return new ComparatorProductsByRating().reversed();
            case 8: return new ComparatorProductsByQuantity().reversed();
            default: return null;
        }
    }




    public static List<Product> getSortedList(List<Product> list, Comparator<Product> comparator){
        ArrayList<Product> result = new ArrayList<>(list);
        result.sort(comparator);
        return result;
    }



    public static void printProducts(List<Product> products){
        for (Product product: products ){
            System.out.println(product);
        }
    }
}