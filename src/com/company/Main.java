package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    int space;
        String etoile="";
        for (int i=0;i<4;i++)
	    {
            space=4-1-i;

            for (int j=0;j<space;j++)
            {
                System.out.print(" ");

            }
            etoile=etoile+"* ";
            System.out.println(etoile);
        }
    }
}
