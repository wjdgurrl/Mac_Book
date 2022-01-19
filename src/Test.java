class Updater
{
    void update(Counter counter)
    {
        counter.count ++;
    }
}

class Counter
{
    int count = 0;
}

public class Test
{
    public static void main(String[] args)
    {
        Counter myCounter = new Counter();
        System.out.println("before = "+ myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after = "+ myCounter.count);
    }
}