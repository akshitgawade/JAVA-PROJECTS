class strbuffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, "india");
        System.out.println(sb);

        sb.replace(5, 10, "Java");
        System.out.println(sb);
        
        sb.delete(2, 5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}