package pl.edu.uwm.obiektowe.lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FunMieszajaca_4 {
    private HashMap<Integer, HashSet<String>> kody;

    public FunMieszajaca_4(String plik) throws FileNotFoundException
    {
        this.kody = new HashMap<>();
        File plik_ = new File(plik);
        Scanner scan = new Scanner(plik_);
        while (scan.hasNext()){
            String str = scan.next();
            boolean czy = false;
            for(int x: this.kody.keySet()){
                if (str.hashCode() == x) {
                    czy = true;
                    break;
                }
            }
            if(!czy){
                this.kody.put(str.hashCode(),new HashSet<>());
            }
            this.kody.get(str.hashCode()).add(str);
        }
        this.wypisz();
    }

    public void wypisz(){
        for(int x: this.kody.keySet()){
            if(this.kody.get(x).size()>1){
                System.out.print(x+":");
                for(String word: this.kody.get(x)){
                    System.out.print(" "+word);
                }
                System.out.println();
            }
        }
    }
}