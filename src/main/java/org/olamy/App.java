package org.olamy;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App
{
    public static void main( String[] args )
    {

        Arrays.asList( "java.version", "java.runtime.version", "java.vm.version", "java.specification.version",
                       "java.vm.specification.version" ).stream().forEach(
            prop -> System.out.println( prop + " :" + System.getProperty( prop ) ) );


        System.out.println( "Runtime.getRuntime().availableProcessors():" + Runtime.getRuntime().availableProcessors() );

    }
}
