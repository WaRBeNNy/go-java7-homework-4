import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

import static java.lang.System.exit;

public class MyCollectionDemo {
    MyCollection collection = new MyCollection();
    Scanner scanner = new Scanner(System.in);

    public void start() {

        do {
            System.out.println("Что делать с коллекцией?");
            System.out.println("    1. Добавить элемент");
            System.out.println("    2. Удалить элемент");
            System.out.println("    3. Найти элемент по значению");
            System.out.println("    4. Найти элемент по индексу");
            System.out.println("    5. Найти минимальное");
            System.out.println("    6. Найти максимальное");
            System.out.println("    7. Найти среднее");
            System.out.println("    8. Вывести коллекцию");
            System.out.println("    9. Захватить мир");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите элемент:");
                    collection.add(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Какой элемент удалить?");
                    collection.remove(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Какое значение ишем?");
                    collection.findByValue(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Какой элемент вывести?");
                    System.out.println(collection.findByIndex(scanner.nextInt()));
                    break;
                case 5:
                    System.out.println("Минимальное значение в коллекции: " + collection.findMin());
                    break;
                case 6:
                    System.out.println("Максимальное значение в коллекции: " + collection.findMax());
                    break;
                case 7:
                    System.out.println("Среднее значение в коллекции: " + collection.findAverage());
                    break;
                case 8:
                    System.out.println(collection.toString());
                    break;
                case 9:
                    exit(0);
                    break;
                default:
                    System.out.println("Что-то не то");
            }
        } while(true);
    }
}
