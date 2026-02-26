package pillarsofOops.Abstraction.demo;

abstract class RBI {
    abstract void ROI();
}
    class HDFC extends RBI{
        void ROI(){
            System.out.println("Rate of Interest is 10 ");
        }
    }
    class SBI extends RBI{
        void ROI(){
            System.out.println("rate of interest is 20 ");
        }
    }
    class employee6{
        public static void main(String[] args) {
            HDFC h=new HDFC();
            h.ROI();

        }
    }

