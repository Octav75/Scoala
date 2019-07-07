//package functional;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static jdk.nashorn.internal.objects.NativeArray.forEach;
//
//public class Filter {
//    public static void main(String[] args) {
//        List<String> versions = new ArrayList<>();
//        versions.add("1234");
//        versions.add ("12345");
//        versions.add ("123456");
//
//        // filter
//        versions.stream()
//                .filter(version => version.lenght() < 6)
//                .forEach(version => System.out.println(version);));
//
//// ==============
//
//        for (String version : versions){
//            if (version.length() < 6){
//                System.out.println(version);
//            }
//        }
//    }
//}
