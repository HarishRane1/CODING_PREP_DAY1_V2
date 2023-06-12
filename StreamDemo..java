//program to copy one image from one location to another
import java.io.*;

class StreamDemo
{
    public static void main(String args[])throws Exception
    {
        FileInputStream fis = new FileInputStream(args[0]);

        byte b[] = new byte[fis.available()];

        fis.read(b);

        FileOutputStream fos = new FileOutputStream("./Test/copy.png");


    }
}