class Printer
{
    private int numOfPapers = 0; //남은 용지

    void print(int amount)
    {
        int remain = numOfPapers - amount;
        System.out.println("프린터 출력합니다.\n남은 용지="+remain);


    }
}

public class PrinterTest
{
    public static void main(String[] args)
    {
        //Printer 클래스 테스트
        Printer printer = new Printer(); // 객체 생성
        printer.print(2);
        printer.print(10);




    }
}
