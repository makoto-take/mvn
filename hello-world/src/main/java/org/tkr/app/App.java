package org.tkr.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        for ( int i = 0; i < 10 ; i++ ) {
            System.out.println( "Number: " + i );
            if ( i % 2 == 0 ) {
                System.out.println( "Even number" );
            } else {
                System.out.println( "Odd number" );
            }
        }
    }
}
