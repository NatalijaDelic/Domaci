package stek.zadaci;

import java.util.Scanner;
import java.util.Stack;

public class Zadaci {


    /*
     * 1. Palacinke
     * Sara pravi palacinke sa dzemom, nutelom i sunkom za svoje drugare.
     * Funkciji se prosledjuje niska sa vrsom palacinke koju je Sara napravila, odovjene novim redom, redom;
     * kao i broj n koji oznacava koliko palacinaka ce pojesti Sarini prijatelji.
     * Ispisati kojim redom ce koje palacinke Sara pojesti posle svojih drugara, ako znamo da ce da pojede sve koje ostanu.
     *
     * NPR:
     * Nutela
     * Sunka
     * Nutela
     * Dzem
     * 2
     * ---------
     * Sunka
     * Nutela
     * */

    public static String palacinke(String s, int n) {///nutela,sunka,nutela,dzem;//2
        Stack<String> stack = new Stack<>();
        String[] niz = s.split("\n");
        String res = "";
        for (int i = 0; i < niz.length; i++) {
            stack.push(niz[i]);
        }
        for (int i = 0; i < n; i++) {
            if (!stack.isEmpty())
                stack.pop();
        }
        if (stack.isEmpty())
            return ":(";
        while (!stack.isEmpty()) {
            res += stack.pop() + "\n";
        }
        return res.trim();
    }

    /*
     * 2. Istorija web pregledaca
     * Прегледач веба памти историју посећених сајтова и корисник има могућност да се враћа унатраг на сајтове које је раније посетио.
     * Написати програм који симулира историју прегледача тако што се учитавају адресе посећених сајтова (свака у посебном реду),
     * а када се учита ред у коме пише back прегледач се враћа на последњу посећену страницу.
     * Ако се наредбом back вратимо на почетну страницу, исписати -.
     * Ако се на почетној страници изда наредба back, остаје се на почетној страници.
     * Програм треба да испише све сајтове које је корисник посетио.
     * Улаз: Са стандардног улаза се учитавају веб-адресе, свака у посебној линији, koje се даље уписују у String, свака у посебном реду.
     * Излаз: Вратити String са исписаним сајтовима редом посећиваним.
     * */

    public static String history(String search) {
        Stack<String> stack = new Stack<>();
        String[] niz = search.split("\n");
        String res = "";
        for (String s : niz) {
            if (!s.equals("back")) {
                stack.push(s);
                res += s + "\n";

            } else {
                if (!stack.isEmpty())
                    stack.pop();
                if (stack.isEmpty())
                    res += "-\n";
                else
                    res += stack.peek() + "\n";
            }

        }


        return res.trim();
    }

    /*
     * 3. Uparenost zagrada:
     * У изразу учествују следеће врсте заграда (, ), {, }, [ и ].
     * Напиши програм који проверава да ли су у унетом изразу заграде исправно упарене.
     * Улаз: Са стандардног улаза се уноси израз (цео у једном реду, без размака), које се даље уписују у String.
     * Излаз: Boolean.
     * */

    public static boolean uparenost(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char Zagrada: s.toCharArray()) {
            if (Zagrada=='(' || Zagrada=='{' || Zagrada=='['){
                stack.push(Zagrada);
            }
            if (Zagrada==')'|| Zagrada=='}'|| Zagrada==']'){
                if (stack.isEmpty())
                    return false;
                char a= stack.pop();
                if (Zagrada==')' && a!='(')
                    return false;
                if (Zagrada=='}' && a!='{')
                    return false;
                if (Zagrada==']'&& a!='[')
                    return false;
            }

        }
        return stack.isEmpty();



    }


    /*
     * 4. Uzastopni brojevi
     * Низ се трансформише тако што се сваких 2 узастопних појављивања неког елемента бришу.
     * Напиши програм који одређује садржај низа након исцрпне примене ове трансформације.
     * Улаз:Са стандардног улаза се учитава елементи низа.
     * Излаз: На стандардни излаз исписати елементе резултујућег низа, раздвојене размаком.
     * NPR:
     * 1 1 2 2 2 2 1 3 4 4 5 5 4 4 3 2 1 1 1
     * "1 3 3 2 1"
     * */

    public static String uzastopni(int[] arr) {
        Stack<Integer>stack=new Stack<>();
        String res=" ";
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty())
                stack.push(arr[i]);
            else {
                if (arr[i]==stack.peek()){
                    if (!stack.isEmpty())
                        stack.pop();
                }
                else{
                    res+=stack.pop() + " ";
                    stack.push(arr[i]);


                }
            }


        }
       while (!stack.isEmpty())
           res+=stack.pop() + " ";

        return res.trim();
    }

    /*
     * 5. Linijski editor
     * Sa standardnog ulaza se unose niske karaktera koje opisuju neku akciju. Akcije su sledece:
     * iX - korisnike je otkucao karakter X
     * < - korisnik je pritisnuo taster levo
     * > - korisnik je pritisnuo taster desno
     * b - korisnik je pritisnuo taster backspace za brisanje karaktera iza kursora
     * d - korisnik je pritisnuo taster delete za brisanje karaktera ispred kursora
     *
     * Vratiti String dobijen izvrsavanjem svih ackija
     *
     * NPR:
     * iaib<bic>>
     * cb
     *
     * Objasnjenje:
     * Tekst     Naredba
     * |         ia
     * a|        ib
     * ab|       <
     * a|b       b
     * |b        ic
     * c|b       >
     * cb|       >
     * cb|
     *
     * */

    public static String console(String input) {
        //TODO: implement me
        return "";
    }

    /*
     * 6. Vrednost postfiksnog izraza
     * Са стандардног улаза се учитава постфиксно записан израз
     * који садржи једноцифрене бројеве и операторе +, -, * и / (без размака).
     * Ispisati vrednost izraza
     *
     * NPR:
     * 12+3*
     * 9
     *
     * Objasnjenje:
     * 12+3* -> (1+2)*3 = 3*3 = 9
     * */

    public static int eval(String s) {
        //TODO: Implement me
        return 0;
    }


    /*
     * 7. Berza
     * Duzina Si cene nekoe hartije ne berzi je definisana kao najveci broj uzastopnih dana,
     * pre datog dana, za koje je cena hartije manja ili jednaka trenutnoj ceni.
     * Za dat niz cena jedne hartije, vratiti niz duzina Si za svaki od tih dana
     *
     * NPR:
     * Cene po danima:      [100, 80, 60, 70, 60, 75, 85]
     * Si duzine po danima: [  1,  1,  1,  2,  1,  4,  6]
     * */

    public static int[] hartije(int... hartija) {
        //TODO: Implement me
        return null;
    }
}


