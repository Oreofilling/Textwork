public class Text
{
    public static void main( String[] args )
    {
        try {    method1();    } // end try
        catch ( Exception exception ) {
            System.err.printf( "%s\n\n", exception.getMessage() );
            StackTraceElement[] traceElements = exception.getStackTrace();
            System.out.println( "\nStack trace from getStackTrace:" );
            System.out.println( "Class\t\tFile\t\t\tLine\tMethod" );
            for ( StackTraceElement element : traceElements )
            {
                System.out.printf( "%s\t", element.getClassName() );
                System.out.printf( "%s\t", element.getFileName() );
                System.out.printf( "%s\t", element.getLineNumber() );
                System.out.printf( "%s\n", element.getMethodName() );
            } // end for
        } // end catch
    } // end main
    public static void method1() throws Exception
    {
        method2();
    } // end method method1
    public static void method2() throws Exception
    {

        throw new Exception( "Exception thrown in method2" );
    } // end method method2
    public static void method3() throws Exception
    {
        throw new Exception( "Exception thrown in method3" );
    } // end method method3
} // end class UsingException