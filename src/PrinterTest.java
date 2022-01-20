class Printer
{
    private int numOfPapers; //남은 용지

    Printer (int paper)
    {
        numOfPapers = paper;
    }
    void print(int amount)
    {
        int remain = numOfPapers - amount;
        System.out.printf("%d장 프린터 출력합니다.\n남은 용지="+remain,amount);
        System.out.println("\n");
    }
}

public class PrinterTest
{
    public static void main(String[] args)
    {
        //Printer 클래스 테스트
        Printer printer = new Printer(10); // 객체 생성
        printer.print(2);
        printer.print(20);
        printer.print(10);




    }
}
