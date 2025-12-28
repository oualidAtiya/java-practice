final class Conversion
{
    static private double celsius ;

    static public double toFahrenheit(double celsius)
    {
        System.out.println("he from double");
        return (celsius * 9/5) + 32 ; 
    }

    static public double toFahrenheit(int celsius)
    {
        double val = (double)celsius;
        return toFahrenheit(val);
    }

    static public double toFahrenheit(String celsius)
    {
        double val = Double.parseDouble(celsius);
        return toFahrenheit(val) ;
    }
}

// public static void main(String[] args)
// {
// System.out.println(new Conversion().toFahrenheit(10.30));
// System.out.println(new Conversion().toFahrenheit(10));
// System.out.println(new Conversion().toFahrenheit("10.30"));
// }