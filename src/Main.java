
public class Main {
    public static void main(String[] args) {
        // Thread
        PeopleQueue queue1 = new PeopleQueue(new String[]{"Иван", "Александр", "Степан"});
        PeopleQueue queue2 = new PeopleQueue(new String[]{"Мария", "Василиса", "Ангелина"});
        System.out.println("начали");
        System.out.println(queue1.getState()); // смотреть состояние потока
        //queue1.start(); // запускаем поток1
        System.out.println(queue1.getName()); // узнать имя потока
        System.out.println(queue1.getPriority()); // узнать приоритет потока
        System.out.println(queue1.getState());
        //queue2.start(); // запускаем поток2
        queue1.setPriority(Thread.MIN_PRIORITY);  // задать максимальный приоритет потоку
        System.out.println(queue1.getPriority());
        queue2.setPriority(Thread.MAX_PRIORITY);
        queue2.start(); // запускаем поток2
        queue1.start(); // запускаем поток2
        try{
            queue1.join(); // ожидаем завершения работы потоков
            queue2.join();
        } catch(Exception e ){
            System.out.println("error");
        }

        System.out.println("завершили");
    }
}
class PeopleQueue extends Thread {
    String [] names;
    public PeopleQueue(String [] names){
        this.names = names;
    }
    @Override
    public void run(){
        for(int i = 0; i < names.length; i++){
            System.out.println("подошла очередь "+names[i]);
            try{
                sleep(1000); // задержка 0.5 сек
            } catch(Exception e){
                System.out.println("error");
            }
        }
    }
}