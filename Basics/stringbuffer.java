public class stringbuffer {
    public static void main(string[] args) {
        StringBuffer sb = new StringBuffer("vishva");//this is mutable
        System.out.println(sb.append(" hello"));//concatinate at back
        System.out.println(sb.capacity());
        String str = sb.toString();
        System.out.println(str);
        System.err.println(sb.deleteCharAt(2));
        System.out.println(sb.delete(3,9));
    }
}
