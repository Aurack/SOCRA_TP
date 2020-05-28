package com.epita.socra.app;

import com.epita.socra.app.tools.*;

public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    public void run(){
        String choice = adapter.read();
        if (choice.compareTo("Roman") == 0) {
            Roman_to_int converter = new Roman_to_int();
            String roman = adapter.read();
            String roman_converted = converter.roman_to_int(roman);
            adapter.write(roman_converted);
        }
        else if (choice.compareTo("Arabic") == 0) {
            Int_to_roman converter = new Int_to_roman();
            String number = adapter.read();
            String number_converted = converter.int_to_roman(Integer.parseInt(number));
            adapter.write(number_converted);
        }
    }
}
