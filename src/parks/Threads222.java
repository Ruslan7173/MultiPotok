package parks;
//3. Создать массив потоков.
// Запустить 5 потоков, каждый из которых выполняет свою задачу (метод start).
//Дождаться завершения всех потоков и вывести сообщение об этом в конце,
//в главном потоке.

public class Threads222 {
    public static void main(String[] args) {
        MyThead1 thread1 = new MyThead1("поток 1");
        MyThead2 thread2 = new MyThead2("поток 2");
        MyThead1 thread3 = new MyThead1("поток 3");
        MyThead2 thread4 = new MyThead2("поток 4");
        MyThead1 thread5 = new MyThead1("поток 5");
           }
}
