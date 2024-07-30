import java.util.*;

 class pr9{
    static String m;
    static char l;
    
    static String repeat() {
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your string: ");
        m = sc.next();
        for (int i = 0; i < m.length(); i++) {
            l = m.charAt(i);
            result.append(l).append(l);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = repeat();
        System.out.print(result);
    }
}
