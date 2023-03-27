import java.math.BigDecimal;

public class Calculator {
    public static void main(String[] args){

        try {
            BigDecimal num1 = new BigDecimal("1");
            BigDecimal num2 = new BigDecimal("0");
            System.out.println("足し算の結果は"+num1.add(num2));
            System.out.println("引き算の結果は"+num1.subtract(num2));
            System.out.println("掛け算の結果は"+num1.multiply(num2));
            System.out.println("割り算の結果は"+num1.divide(num2));
        }catch (ArithmeticException e){
            System.out.println("割り算の結果が無限小数になるかnum2の値が0です");
        }}
}
