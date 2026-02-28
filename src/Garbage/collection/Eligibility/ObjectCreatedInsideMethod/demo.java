package Garbage.collection.Eligibility.ObjectCreatedInsideMethod;

public class demo {
    static void createObj() {
        demo obj = new demo();
    }
}
    class ka {
        public static void main(String[] args) {
            demo.createObj();
        }
    }

