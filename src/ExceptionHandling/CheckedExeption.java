package ExceptionHandling;

import java.io.IOException;

public class CheckedExeption {
    static void readFile() throws IOException {
        throw new IOException("File Not Found");
    }

    static void display() throws IOException {
        readFile();
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


