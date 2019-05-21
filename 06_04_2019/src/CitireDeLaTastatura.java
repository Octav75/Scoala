public class CitireDeLaTastatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char lastLetter = str.charAt(str.lenght()-1);
        System.out.println(lastLetter);
        System.out.println(str.lenght());

    }

}
