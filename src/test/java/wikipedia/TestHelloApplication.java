package wikipedia;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class TestHelloApplication {

    HelloApplication.Greeter helloGreeterMock;
    Appendable helloWriterMock;
    HelloApplication.HelloActable helloAction;

    @Before
    public void setUp() {
        helloGreeterMock = mock(HelloApplication.Greeter.class);
        helloWriterMock = mock(Appendable.class);
        helloAction = new HelloApplication.HelloAction(helloGreeterMock, helloWriterMock);
    }

    @Test
    public void testSayHello() throws Exception {
        when(helloWriterMock.append(any(String.class))).thenReturn(helloWriterMock);
        when(helloGreeterMock.getIntroduction(eq("unitTest"))).thenReturn("unitTest : ");
        when(helloGreeterMock.getGreeting(eq("world"))).thenReturn("hi world");

        helloAction.sayHello("unitTest", "world");

        verify(helloGreeterMock).getIntroduction(eq("unitTest"));
        verify(helloGreeterMock).getGreeting(eq("world"));

        verify(helloWriterMock, times(2)).append(any(String.class));
        verify(helloWriterMock, times(1)).append(eq("unitTest : "));
        verify(helloWriterMock, times(1)).append(eq("hi world"));
    }
}