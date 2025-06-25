public class runnable {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Task is running using Rnnable");
        r1.run();
    }
}
