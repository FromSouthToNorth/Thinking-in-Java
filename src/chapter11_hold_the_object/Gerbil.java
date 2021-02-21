package chapter11_hold_the_object;

/**
 * 沙鼠类
 *
 * @author hy
 * @date 2021-02-15
 */
public class Gerbil
{
    private int gerbilNumber;

    private String jump;

    public Gerbil()
    {
    }

    public Gerbil(int gerbilNumber, String jump)
    {
        this.gerbilNumber = gerbilNumber;
        this.jump = jump;
    }

    public int getGerbilNumber()
    {
        return gerbilNumber;
    }

    public void setGerbilNumber(int gerbilNumber)
    {
        this.gerbilNumber = gerbilNumber;
    }

    public String getJump()
    {
        return jump;
    }

    public void setJump(String jump)
    {
        this.jump = jump;
    }

    @Override
    public String toString()
    {
        return "Gerbil{" +
                "gerbilNumber=" + gerbilNumber +
                ", jump='" + jump + '\'' +
                '}';
    }
}
