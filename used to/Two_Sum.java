import java.io.*;
import java.util.*;
import java.lang.*;
public class Two_Sum
{
    public static void main(String[] args)
    {
        ArrayList book = new ArrayList();
        boolean flag = false;
        String target = null;
        /////////////////////////////////
        //input the elements in the list
        /////////////////////////////////
        System.out.println("Please input the elements!(Typing exit when you finish)");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while(     ((line = br.readLine()) != null)  )
            {
                if(line.equals("exit"))
                {
                    break;
                }
                book.add(line);
            }
            System.out.println("List 长度为: " + book.size());
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        //////////////////////////
        //input the target number
        //////////////////////////
        System.out.println("Please input the specific target");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            target = br.readLine();
            System.out.println("Target is: " + target);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        //////////////////////////
        //Logic
        //////////////////////////
        for (int i=0;i<book.size();i++)
        {
            for (int j=i+1;j<book.size();j++)
            {
                if ( (Integer.parseInt((String)book.get(i))+ Integer.parseInt((String)book.get(j)) ) == (Integer.parseInt((String)target) ))
                {
                    System.out.println("Because nums[" + i + "] + nums[" + j + "] = " + book.get(i) + " + " + book.get(j) + " = " + target);
                    flag = true;
                    break;
                }
            }
            if(flag==true)
                break;
        }
        if (flag == false)
        {
            System.out.println("no good");
        }
    }
}