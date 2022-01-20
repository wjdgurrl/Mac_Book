package src;
class Calculator // 연습문제 2
{
    int value;

    Calculator()
    {
        this.value  = 0;
    }
    void add(int val)
    {
        this.value += val;
    }
    int getValue()
    {
        return this.value;
    }
    boolean isOdd(int num)
    {
      return num % 2 == 1;
    }
}

class MaxLimitCalculator extends Calculator
{
    void add(int val)
    {
        this.value += val;
        if(this.value>100)
        {
            this.value = 100;
        }
    }
}

public class Sample
{
    public static void main(String[] args)
    {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);
        System.out.println(cal.getValue());
        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));

    }

}