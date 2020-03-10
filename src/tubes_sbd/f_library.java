
package tubes_sbd;
import java.util.stream.IntStream;


public class f_library {
    public int getListIndexBy(String[] s, String t){
        return IntStream.range(1, s.length).filter(i -> t.equalsIgnoreCase(s[i]))
                        .findFirst().orElse(-1);
    }
    public void pr_ln(String s){
        System.out.println(s);
    }
    public void pr_nm(String s){
        System.out.print(s);
    }
    public String[] q_s(String s){
        return s.replaceAll("[,()]", " ").replace(";"," ;").replace("=", " = ")
                .replaceAll(" +", " ").split(" ");
    }
    public String str_loop(String[] qry,String s, int x, int lim){
        String y = "";
        for (int i = x; i < lim; i++) {
            y = y + qry[i]+",";
        }
        return y;
    }
}
