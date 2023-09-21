import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz rozmiar tablicy");
        int sizeTab = scanner.nextInt();
        int[] numberTab = new int[sizeTab];
        for (int i = 0; 1 < sizeTab; i++) {

            if (i % 10 == 0) {
                System.out.println();
            }
            numberTab[i] = (int) (Math.random() * 100);
            System.out.print(numberTab[i] + ", ");

        }
        System.out.println("wpisz jakaliczb echcesz odszukac");
        int lockedNumber = scanner.nextInt();
    }


    public boolean findNumber(int[] numberTab, int lockedForNumber) {
        int i = 0;
        int size = numberTab.length;
        while (i < size && numberTab[i] != lockedForNumber) {
            i++;
        }
        if(i==size)return false;
        return true;

    };
    }
