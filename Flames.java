import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine().toLowerCase().replace(" ", "");
        String name2 = sc.nextLine().toLowerCase().replace(" ", "");
        for (int i = 0; i < name1.length(); i++) {
            char ch = name1.charAt(i);

            if (name2.indexOf(ch) != -1) {
                name1 = name1.replaceFirst(String.valueOf(ch), "");
                name2 = name2.replaceFirst(String.valueOf(ch), "");
                i--;
            }
        }
        int count = name1.length() + name2.length();
        String flames = "FLAMES";
        int index = 0;
        while (flames.length() > 1) {
            index = (index + count - 1) % flames.length();
            flames = flames.substring(0, index) + flames.substring(index + 1);
        }
        char result = flames.charAt(0);
        if (result == 'F') System.out.println("Friends");
        else if (result == 'L') System.out.println("Love");
        else if (result == 'A') System.out.println("Affection");
        else if (result == 'M') System.out.println("Marriage");
        else if (result == 'E') System.out.println("Enemies");
        else if (result == 'S') System.out.println("Siblings");
    }
}
