public class DivisibleBy3And5Thread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number divisible by 3 and 5: " + i);
                try {
                    Thread.sleep(1000); // 1 second delay
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        DivisibleBy3And5Thread thread = new DivisibleBy3And5Thread();
        thread.start();
    }
}
