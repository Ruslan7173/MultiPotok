package parks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadNatasha {
    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();
        list.add(new Products(new String[]{"Masha", "Vera"}));
        list.add(new Products(new String[]{"Kolya", "Petya"}));
        list.add(new Products(new String[]{"Mama", "papa"}));
        list.add(new Products(new String[]{"Cola", "Fanta"}));
        list.add(new Products(new String[]{"Cofe", "Tea"}));

        for (int i = 0; i < list.size(); i++) {
            list.get(i).start();
            System.out.println("Работаем " + Arrays.toString(list.get(i).names));
        }
        try {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).join();
                System.out.println("завершили " + Arrays.toString(list.get(i).names));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("закончили");
    }

    public static class Products extends Thread {
        String[] names;

        public Products(String[] names) {
            this.names = names;
        }

        @Override
        public String toString() {
            return "Products{" +
                    "names=" + Arrays.toString(names) +
                    '}';
        }

        @Override
        public void run() {
            System.out.println("Потоки заработали");
        }
    }

}
