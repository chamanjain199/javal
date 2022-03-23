package javal.java.all;

import java.util.Arrays;
import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        BitSet bitSet=new BitSet();
        System.out.println(bitSet.cardinality());
        System.out.println(bitSet.length());
        System.out.println(bitSet.size());

        bitSet.set(0);
        System.out.println("------------------");
        System.out.println(bitSet.cardinality());
        System.out.println(bitSet.length());
        System.out.println(bitSet.size());

        bitSet.set(0,false);
        System.out.println("------------------");
        System.out.println(bitSet.cardinality());
        System.out.println(bitSet.length());
        System.out.println(bitSet.size());

        bitSet.set(0,10);
        System.out.println("------------------");
        System.out.println(bitSet.cardinality());
        System.out.println(bitSet.length());
        System.out.println(bitSet.size());
        bitSet.set(31);

        bitSet.set(65);
        System.out.println("------------------");
        System.out.println(bitSet.cardinality());
        System.out.println(bitSet.length());
        System.out.println(bitSet.size());
        System.out.println(bitSet.get(8));
        System.out.println(bitSet.get(62));

        bitSet.stream().forEach(x->System.out.print(" "+x));
        System.out.println(Arrays.toString(bitSet.toLongArray()));

        BitSet range=bitSet.get(0,64);
        for (int i = 0; i < 64; i++) {
            System.out.print(" "+range.get(i));
        }
        System.out.println();

        System.out.println(bitSet.get(8));
        bitSet.flip(8);
        System.out.println(bitSet.get(8));

        BitSet b1=new BitSet();
        b1.set(0,3);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+b1.get(i));
        }
        BitSet b2=new BitSet();
        b2.set(0,10);

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+b2.get(i));
        }
        b1.and(b2);
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(" "+b1.get(i));
        }


    }
}
