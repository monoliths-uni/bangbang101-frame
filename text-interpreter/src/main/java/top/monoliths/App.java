package top.monoliths;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Log log = LogFactory.getLog(App.class);
        log.error("message");
        log.error("test error");
        System.out.println( "Hello World!" );
    }
}
