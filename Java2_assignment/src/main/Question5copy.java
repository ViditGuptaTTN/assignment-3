package main;

public class Question5copy {
    public int x;
    public int y;

    public Question5copy(int x, int y)
    {
        super();
        this.x = x;
        this.y = y;
    }

    public Question5copy(Question5copy p)
    {
        this.x = p.x;
        this.y = p.y;
    }
}
