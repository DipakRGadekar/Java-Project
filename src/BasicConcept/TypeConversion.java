package BasicConcept;
public class TypeConversion {

    public static void main(String[] args) {
        implicitCasting();
        explicitCasting();
    }

    private static void implicitCasting() {
        // Implicit widening
        // byte>short>int>long>float>double

        byte t1 = 12;
        System.out.println("Byte value: " + t1);
        short t2 = t1;
        System.out.println("short value after conversion: " + t2);
        int t3 = t2;
        System.out.println("int value after conversion: " + t3);
        long t4 = t3;
        System.out.println("long value after conversion: " + t4);
        float t5 = t4;
        System.out.println("float value after conversion: " + t5);
        double t6 = t5;
        System.out.println("Double value after conversion: " + t6);
        
        System.out.println("------------------------------------");
    }

    private static void explicitCasting() {
        // Explicit narrowing
        // double>float>long>int>short>byte

        double d = 1234.56;
        System.out.println("Double value: " + d);
        float f = (float) d;
        System.out.println("Float value after conversion: " + f);
        long l = (long) f;
        System.out.println("Long value after conversion: " + l);
        int i = (int) l;
        System.out.println("Int value after conversion: " + i);
        short s = (short) i;
        System.out.println("Short value after conversion: " + s);
        byte b = (byte) s;
        System.out.println("Byte value after conversion: " + b);
    }
}
