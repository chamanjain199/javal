package javal.java.java17.sealed;

sealed class A permits B {

}

non-sealed class B extends A {

}
//

non-sealed class C extends A {

}

public class MyFirstSealedEx {

}
