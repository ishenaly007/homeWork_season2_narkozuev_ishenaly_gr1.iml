import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Names=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя для группы А("+(i+1)+"): ");
            Names.add(i,scanner.nextLine());

        }
        System.out.println(Names);
        /*for (String name:Names) {

            System.out.println(name);
        }*/
        ArrayList<String> Names2=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя для группы Б("+(i+1)+"): ");
            Names2.add(i,scanner.nextLine());

        }
        System.out.println(Names2);
     /*   for (String name:Names2) {

            System.out.println(name);

        }*/
        ArrayList<String> allNames=new ArrayList<>();
     /*   for (int i = 0; i < 5; i++) {
            allNames.add(i,Names.get(i));
            allNames.add(1+i,Names2.get(i));
        }*/

        allNames.add(0, Names.get(0));
        allNames.add(1, Names2.get(4));
        allNames.add(2, Names.get(1));
        allNames.add(3, Names2.get(3));
        allNames.add(4, Names.get(2));
        allNames.add(5, Names2.get(2));
        allNames.add(6, Names.get(3));
        allNames.add(7, Names2.get(1));
        allNames.add(8, Names.get(4));
        allNames.add(9, Names2.get(0));
        System.out.println(allNames);
        for (String allName:allNames) {
              System.out.println(allName);

        }
        allNames.sort(Comparator.comparingInt(String::length));

        System.out.println(allNames);
    }

}