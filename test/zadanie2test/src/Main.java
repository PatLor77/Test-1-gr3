import java.util.Random;
import java.util.Scanner;

 class dodatek {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random c = new Random();
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for(int i=0;i<n;i++){
            tab[i] = c.nextInt(50+50)-50;
            System.out.print(tab[i]+" ");
        }
        System.out.println("");
        int max=-51;
        for(int i=0;i<tab.length;i++)
            if(max<tab[i]) max=tab[i];
        System.out.println(max);
        int odwrotnie =0;
        for(int i=0;i<tab.length;i++)
            if(max==tab[i]) odwrotnie++;
        System.out.println(odwrotnie);
    }
}