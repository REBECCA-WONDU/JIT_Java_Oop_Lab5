import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] x;
        x = new int[3];
        String[] names;
        names = new String[]{"ABEBE", "CHALA", "SARON"};
        String[] address = {"Jimma", "Hawassa","ADDIS ABABA"};
        names = new String[3];
        Scanner scan = new Scanner(System.in);
        for ( int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine();
            System.out.println("Enter the name of the first person: " + names);
            names[i] = scan.nextLine();
            System.out.println(address[0]);
            System.out.println("Enter the name of the second person: "+names);
            names[i] = scan.nextLine();
            System.out.println(address[1]);
            System.out.println("Enter the name of the last person:"+names);
            names[i] = scan.nextLine();
            System.out.println(address[2]);

        }


    }
    }