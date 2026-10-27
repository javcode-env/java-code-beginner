package chapter8;

public class strings {
         public static void main(String[] args) {
         //     String name = "Meet";
         //     System.out.println(name); // first method

         //     String city = new String("Noida");
         //     System.out.println(city);  // 2nd method

         //     String name = "Meet";

         //     System.out.println(name.length());

         //     System.out.println(name.charAt(0));

         //     System.out.println(name.toUpperCase());

         //     System.out.println(name.toLowerCase());

         //     String sentence = "I love java";

         //     System.out.println(sentence.contains("java"));

         //     String language = "Java Programming";

         //     System.out.println(language.startsWith("Java"));
         //     System.out.println(language.endsWith("Programming")); 

         //     System.out.println(language.replace("Java", "Python"));

         // String a = "Java";
         // String b = "Java";

         // System.out.println(a == b); //true because both are pointing to same object in string pool

         // System.out.println(a.equals(b)); // true because both are pointing to same object in string pool

         StringBuilder sb = new StringBuilder("Java");

         sb.append(" Programming");
         sb.insert(0, "Hello, ");
         sb.delete(0, 7);
         System.out.println(sb);
         }
}

// String is immutable