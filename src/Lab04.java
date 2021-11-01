import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lab04 {

    public static int countChar(String str, char c) {
        int count = 0;
        char [] chars = str.toCharArray();
        for(int i = 0; i < str.length();  i++)
        {
            if (c == chars[i])count++;
        }
        return count;
    }

    public static int countSubStr(String str, String subStr) {
        int count = 0;
        for(int i = str.indexOf(subStr); i >= 0; i = str.indexOf(subStr, i + subStr.length()))
        {
            count++;
        }
        return count;
    }

    public static String middle(String str) {
        String returnedStr = "";
        if (str.length() == 0)
            return returnedStr;
        if (str.length() % 2 == 1)
            returnedStr = returnedStr + str.charAt(str.length() / 2);
        if (str.length() % 2 == 0)
            returnedStr = returnedStr + str.charAt(str.length() / 2) + str.charAt((str.length() / 2) - 1);
        return returnedStr;
    }

    public static String repeat(String str, int n) {
        return String.valueOf(str).repeat(Math.max(0, n));
    }

    public static int[] where(String str, String subStr) {
        int i, j = 0, tab_len = 0;
        for(i = str.indexOf(subStr); i >= 0; i = str.indexOf(subStr, i + subStr.length())) {
            tab_len++;
        }

        int[] tab = new int[tab_len];
        for(i = str.indexOf(subStr); i >= 0; i = str.indexOf(subStr, i + subStr.length())) {
            tab[j] = i;
            j++;
        }
        return tab;
    }

    public static String change(String str){
        StringBuffer strBuff = new StringBuffer();
        strBuff.append(str);
        for(int i = 0; i < strBuff.length(); i++)
        {
            if(Character.isLowerCase(strBuff.charAt(i)))
            {
                strBuff.setCharAt(i, Character.toUpperCase(strBuff.charAt(i)));
            }
            else if(Character.isUpperCase(strBuff.charAt(i))){
                strBuff.setCharAt(i, Character.toLowerCase(strBuff.charAt(i)));
            }
        }
        return strBuff.toString();
    }

    public static String nice(String str){
        StringBuffer strBuff = new StringBuffer();
        strBuff.append(str);
        int count = 0;
        for(int i = strBuff.length() - 1; i > 0; i--)
        {
            count++;
            if(count % 3 == 0)
                strBuff.insert(i, "'");
        }
        return strBuff.toString();
    }

    public static String nice_modified(String str, char sep, int width){
        StringBuffer strBuff = new StringBuffer();
        strBuff.append(str);
        int count = 0;
        for(int i = strBuff.length() - 1; i > 0; i--)
        {
            count++;
            if(count % width == 0)
                strBuff.insert(i, sep);
        }
        return strBuff.toString();
    }

    public static int countChar_file(char character, String file_name) throws IOException {
        if(!Files.exists(Paths.get(file_name)))
        {
            System.err.println("file not exist: " + file_name);
            return 0;
        }

        String content = new String(Files.readAllBytes(Paths.get(file_name)));
        int count = 0;
        char [] chars = content.toCharArray();
        for(int i = 0; i < content.length();  i++)
        {
            if (character == chars[i])count++;
        }
        return count;
    }

    public static int countSubString_file(String subStr, String file_name) throws IOException {
        if(!Files.exists(Paths.get(file_name)))
        {
            System.err.println("file not exist: " + file_name);
            return 0;
        }

        String content = new String(Files.readAllBytes(Paths.get(file_name)));
        int count = 0;
        for(int i = content.indexOf(subStr); i >= 0; i = content.indexOf(subStr, i + subStr.length()))
        {
            count++;
        }
        return count;
    }

    static BigInteger chessboardN_n(int n){
        BigInteger result = new BigInteger("2");
        return result.pow((n*n)-1);

    }

    static BigDecimal deposit(int n, double k, double p){
        BigDecimal result = new BigDecimal(k);
        BigDecimal pBigDecimal = new BigDecimal(p / 100);
        for(int i = 0; i < n; i++){
            //Według polecenia:
            //result = result.add(result.multiply(pBigDecimal)).setScale(2, RoundingMode.CEILING);
            result = result.add(result.multiply(pBigDecimal));
        }
        //Najbliższy wynik:
        result = result.setScale(2, RoundingMode.CEILING);
        return result;

    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

//a)
        String str = "x + x = 2x";
        char c = 'x';

        System.out.println("A:\nW napisie, znak " + c + " występuje " + countChar(str, c) + " razy.");

//b)
        String str1 = "000 000 0000 0 00";
        String subStr = "000";

        System.out.println("B:\nW napisie >> " + str1 + " <<, podnapis >> " + subStr + " << występuje " + countSubStr(str1, subStr) + " razy.");

//c)
        System.out.print("C:\nPodaj napis:");
        String str2 = scan.nextLine();
        System.out.println("Środkowy znak/i dla napisu >> " + str2 + " <<, to >> " + middle(str2));

//d)
        System.out.print("D:\nPodaj napis:");
        String str3 = scan.nextLine();
        System.out.println(repeat(str3, 3));
//e)
        String str4 = "01234161891";
        System.out.print("E:\nPierwszy napis: " + str4);
        String str5 = "1";
        System.out.print("\nPodnapis: " + str5 + "\nIndeksy podnapisu w napisie:\n");
        int[] tab = where(str4, str5);
        for (int j : tab) System.out.print(j + " ");
//f)
        String str6 = "ABCdeFgHi";
        System.out.print("\nF:\nZmodyfikowany napis " + str6 + " -> " + change(str6));
//g)
        String str7 = "1002003004";
        System.out.print("\nG:\nZmodyfikowany napis " + str7 + " -> " + nice(str7));
//h)
        String str8 = "12345678910";
        System.out.print("\nH:\nZmodyfikowany napis " + str7 + " -> " + nice_modified(str8, ' ', 4));
//2)
        System.out.print("\n2:\nIlość znaków w tekście: " + countChar_file('a', "lab04.txt"));
//3)
        System.out.print("\n3:\nIlość napisów w tekście: " + countSubString_file("nie", "lab04.txt"));
//4)
        int n = 8;
        System.out.print("\n4:\nIlość ziarenek na szachownicy o wymiarach " + n + "x" + n + "x =  " + chessboardN_n(n));
//5)
        n = 10;
        double p = 5.5, k = 10713.5;
        System.out.print("\n5:\nKapitał " + k + " po " + n + " latach na oprocentowaniu " + p  + " wynosi: " +
                deposit(n, k, p));
    }
}