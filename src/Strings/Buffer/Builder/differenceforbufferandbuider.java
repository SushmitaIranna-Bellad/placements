package Strings.Buffer.Builder;

public class differenceforbufferandbuider {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("Placements");
        for(int i=0;i<1000000;i++){
            sbf.append("Training");
        }
        System.out.println("Time Taken By StringBuffer "+(System.currentTimeMillis()-starttime)+"ms");
        starttime=System.currentTimeMillis();
        StringBuilder sbl=new StringBuilder("Placements");
        for(int i=0;i<1000000;i++){
            sbl.append("training");
        }
        System.out.println("Time Taken By StringBuilder "+(System.currentTimeMillis()-starttime)+"ms");
        }
}
