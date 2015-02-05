package genericAndExtendsInReturnType;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class TestMyClass {

    @Test
    public void testGetSet() {
        final MyClass mockInstance = mock(MyClass.class);

        final Set<Integer> resultSet = new HashSet<Integer>();
        resultSet.add(1);
        resultSet.add(2);
        resultSet.add(3);

        doReturn(resultSet).when(mockInstance).getSet();

        System.out.println(mockInstance.getSet());
    }
}