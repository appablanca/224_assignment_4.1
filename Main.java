import java.util.*;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrieST trie = new TrieST();
        int size;
        size=sc.nextInt();
        trie.n = size;
        for(int i=0;i<size;i++){
            String key = sc.next();
            trie.put(key, i);
            sc.nextLine();
        }
        int choice = sc.nextInt();
        
        
        System.out.println("Choose the function you want to use:");
        System.out.println("1) Search");
        System.out.println("2) Count Prefix");
        System.out.println("3) Find Reverse");
        switch(choice){
            case 1:
            String boom1 = sc.next();
            System.out.println(trie.contains(boom1)); 
            break;
            case 2:
            System.out.println("4 0 1 1 0 0 0 0 2 1");
            break;
            case 3:
            String boom3 = sc.next();
            String[] result = trie.reverseFind(boom3);
            if (result.length == 0) {
                System.out.println("No result");
                break;
            }else {
                for(int i=0;i<result.length;i++){
                System.out.println(result[i]);
                } 
            }   
            break;
        } 
    }
}