package pl.edu.uwm.obiektowe.lab07.pl.imiajd.trentowski;

public class Punkt
{
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void show()
    {
        System.out.println("<" + x + ", " + y + ">");
    }

    public int x()
    {
        return x;
    }

    public int y()
    {
        return y;
    }

    private int x, y;
}
