public class ConcatString {
    public static void main(String[] args) {
        String name = "Md. Maruf Sarker";
        String address = "Dhaka, Bangladesh";
        long phone = 8801712345678L;

        String contact = name + "\n" + address + "\n" + phone;

        System.out.println(contact);

        String str = name.concat(address).concat(String.valueOf(phone));
        System.out.println(str);
        str = name.concat(" ").concat(address).concat(" ").concat(String.valueOf(phone));
        System.out.println(str);
    }
}
