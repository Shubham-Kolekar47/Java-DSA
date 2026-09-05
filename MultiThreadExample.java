import java.io.*;

// Shared resource class
class SharedResource {
    // synchronized method to ensure only one thread accesses at a time
    synchronized void display(String message) {
        System.out.println(message);
        try {
            Thread.sleep(500); // simulate delay
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Thread for file reading
class FileReadThread extends Thread {
    SharedResource resource;

    FileReadThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                resource.display("File Thread: " + line);
            }

            br.close();
        } catch (IOException e) {
            resource.display("Error reading file: " + e.getMessage());
        }
    }
}

// Thread for mathematical computation
class MathThread extends Thread {
    SharedResource resource;

    MathThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            resource.display("Math Thread: Adding " + i + ", Sum = " + sum);
        }
    }
}

// Main class
public class MultiThreadExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        FileReadThread t1 = new FileReadThread(resource);
        MathThread t2 = new MathThread(resource);

        t1.start();
        t2.start();
    }
}
