package genericAndExtendsInReturnType;

import java.util.HashSet;
import java.util.Set;

public class MyClass {
    Set<? extends Number> getSet() {
        return new HashSet<Integer>();
    }
}