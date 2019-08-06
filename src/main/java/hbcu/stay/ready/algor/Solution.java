//package hbcu.stay.ready.algor;

//public class Solution {

    //public String countUniqueWords(String input){
        //return null;
 //   }
//}
//  The code is not general, It is supposed to only work for the 1st example.

public class Solution

{
public String countUniqueWords(String input){
    return input;
}
    public static void main(String[] args)
    {
        String input="Hello Java. Hello World. Hello Java!";
        String[] words=input.split(" ");
        int wrc=1;

        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {

                if(words[i].equals(words[j]))
                {
                    wrc=wrc+1;
                    words[j]="0";
                }
            }
            if(words[i]!="0")
                System.out.println(words[i]+"--"+wrc);
            wrc=1;

        }

    }

}