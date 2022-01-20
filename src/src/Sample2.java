package src;
//4번 문제

class Calculator2
{
    int value;

    Calculator2()
    {
        this.value = 0;
    }

    void add(int val)
    {
        this.value += val;
    }
    int getValue()
    {
        return this.value;
    }
    void avg()
    {

    }
}

public class Sample2
{
    private static void main(String[] args)
    {
        int[] data = {1,3,5,7};
        Calculator2 cal = new Calculator2();
        int result = cal.avg(data);
        System.out.println(result);
    }
}
