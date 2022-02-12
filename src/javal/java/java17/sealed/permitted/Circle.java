package javal.java.java17.sealed.permitted;

//public sealed class Circle1 {// need to extends a sealed class
//
//}

class NonSealed {

}

sealed interface Unsealed permits Circle {

}

interface Unsealed2  {

}

public non-sealed class Circle extends NonSealed implements Unsealed , Unsealed2 {

}