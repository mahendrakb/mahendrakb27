package Mathematics;
import java.util.*;
import java.lang.*;
import static java.lang.Math.log10;

public class CountDigit {
    public static int digitCount(long n)
    {
        return (int) Math.floor(log10(n)+1);
    }

    public static void main(String[] args) {
        long input = 987654321;
        int output = digitCount(input);
        System.out.println(output);
    }
}
