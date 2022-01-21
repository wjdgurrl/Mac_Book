class Printer
{
    private int numOfPapers; //남은 용지
    private boolean duplex; // 양면인쇄 여부

    Printer (int paper,boolean duplex)//추가한 용지 수
    {
        numOfPapers = paper;
        duplex = duplex;

    }
    void print(int amount)// 뽑으려는 용지 수
    {
        int remain = numOfPapers;
        numOfPapers -= amount;
        duplex = getDuplex();

        if(numOfPapers > 0)
        {

            System.out.println(amount+"장 출력했습니다.");
            System.out.println("남은 용지 수 = "+numOfPapers);
        }
        else if(numOfPapers<=0)
        {
            System.out.println("용지가 없습니다.");
        }
        else
        {
            System.out.println("모두 출력하려면 "+-(numOfPapers)+"장 부족합니다."+remain+"장만 출력합니다.");
            if(numOfPapers<=0)
            {
                System.out.println("용지가 없습니다.");
                numOfPapers = 0;
            }
        }
    }
    public boolean getDuplex()//접근자
    {
        return duplex;
    }
    public void setDuplex(boolean duplex)//설정자
    {
        this.duplex = duplex;
    }
}

public class PrinterTest
{
    public static void main(String[] args)
    {
        //Printer 클래스 테스트
        Printer printer = new Printer(20,false); // 객체 생성
        printer.print(25);
        printer.setDuplex(true);
        printer.print(10);
    }
}
