package DomaciSreda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sreda {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6, 4, 7, 8, 14, 12, 11, 22, 25, 24, 93, 99, 60);
        List<Integer> num1 = numbers.stream().filter(x-> x%3==0).map(x-> x+2).collect(Collectors.toList());
        System.out.println(num1);

        List<Integer> num2 = numbers.stream().map(x -> x * 2).filter(x -> x % 3 != 0).collect(Collectors.toList());
        System.out.println(num2);


        Set<Integer> num3 = numbers.stream().filter(x-> x%2!=0).map(x->x*2).collect(Collectors.toSet());
        System.out.println(num3);

    }
}

