package com.epita.socra.app;

public class Int_to_roman {

    public String int_to_roman(int decimal){
        String str = "";
        int[] tab = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] sym = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int ind = 12;
        while (decimal > 0) {
            int res = decimal / tab[ind];
            decimal = decimal % tab[ind];
            while (res > 0) {
                str += sym[ind];
                res--;
            }
            ind--;
        }
        return(str);
    }
}
