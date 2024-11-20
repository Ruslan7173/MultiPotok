package parks;

public class Threads111 {
    public static void main(String[] args) {
        MyThead1 thread1 = new MyThead1("поток 1");
        MyThead2 thread2 = new MyThead2("поток 2");
        thread1.start();
        thread2.start();

    }
}
class MyThead1 extends  Thread {
    String name;
    public MyThead1(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("имя потока "+name);
            try{
                sleep(100);
            } catch(Exception e){
                System.out.println("error");
            }
        }
    }
}
class MyThead2 extends  Thread {
    String name;
    public MyThead2(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("имя потока "+name);
            try{
                sleep(2000);
            } catch(Exception e){
                System.out.println("error");
            }
        }
    }
}

