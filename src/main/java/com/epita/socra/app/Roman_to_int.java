package com.epita.socra.app;

public class Roman_to_int {
    int value(char letter)
    {
        if (letter == 'I')
            return 1;
        if (letter == 'V')
            return 5;
        if (letter == 'X')
            return 10;
        if (letter == 'L')
            return 50;
        if (letter == 'C')
            return 100;
        if (letter == 'D')
            return 500;
        if (letter == 'M')
            return 1000;
        return -1;
    }

    public String roman_to_int(String roman) {
        Integer number = 0;
        for (int i = 0; i < roman.length(); i++)
        {
            int s1 = value(roman.charAt(i));
            if (i + 1 < roman.length())
            {
                int s2 = value(roman.charAt(i + 1));
                if (s1 >= s2)
                    number = number + s1;
                else
                {
                    number = number + s2 - s1;
                    i++;
                }
            }
            else
            {
                number = number + s1;
                i++;
            }
        }
        return number.toString();
    }
}
