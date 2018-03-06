package org.olamy;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        for (String prop : Arrays.asList("java.version","java.runtime.version","java.vm.version"
                       ,"java.specification.version"
                       ,"java.vm.specification.version") )
        {
            System.out.println( prop + " :" + System.getProperty( prop ) );
        }


    }
}
