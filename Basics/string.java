public class string {
    public static void main(string[] args) {
        String str = new String("vishva");//immutable
        //String str = "vishva";
        System.out.println("Hello "+str);
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(1,4));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("vish"));
        System.out.println(str.equals(str));
        System.out.println(str.replace('v', 'k'));
    }
}
