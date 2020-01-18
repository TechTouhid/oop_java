public class Hello {

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        int myfirstvar = 50;
        System.out.println(myfirstvar);

        byte mybyte = 10;
        short myshort = 20;
        long mylong = 5000L;
        System.out.println(mylong + 10*(mybyte + myshort + myfirstvar));

        // the numbers can be separate using underscore
        // for float need to use f for double need to use d
        float myfolat =5.488_554_546_48f;
        double mydouble = 5.44d;
        boolean mybool = true;

        // write sout and press enter to have System.out.println()
        System.out.println(myfolat);
        System.out.println(mydouble);

        // defining the character type data

        char mychar = 'A';
        char unichar = '\u00A9';
        System.out.println("Unicode character " + unichar);






    }
}
