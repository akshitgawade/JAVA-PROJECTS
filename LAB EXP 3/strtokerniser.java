import java.util.StringTokenizer;
class strtokeniser{
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello,World,Java", ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
