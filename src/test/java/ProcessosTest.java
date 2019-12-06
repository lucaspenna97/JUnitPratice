import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class ProcessosTest {

    @Test
    @DisplayName("testeJunitInt")
    @Timeout(5000)
    void testeJunitInt() {

        Processos processos = new Processos();
        int resultado = processos.testeJunitInt(5,5);
        assertEquals(10, resultado);
    }

    @Test()
    @DisplayName("testeJunitString")
    void testeJunitString() {

        Processos processos = new Processos();
        boolean resultado = processos.testeJunitString("abc","abc");
        assertTrue(resultado);

    }

    @Test
    @DisplayName("testeJunitObject")
    void testeJunitObject() {

        Processos processos = new Processos();
        boolean resultado = processos.testeJunitObject(new User("48092870845", "03572330"), new User("48092870845", "03572330"));
        assertFalse(resultado);
    }

    @Test
    void testJunitArrayInt() {

        Processos processos = new Processos();
        int[] resultado = processos.testJunitArrayInt(1,2,3);
        assertArrayEquals(resultado, new int[]{ 1, 2, 3 });

    }

    @Test
    @DisplayName("testeJunitObject")
    void testeJunitObjectNull() {

        User user = null;
        assertNull(user);
    }

    @Test
    @DisplayName("testeJunitObject")
    void testeJunitObjectNotNull() {

        User user = new User();
        assertNotNull(user);
    }

    @Test
    void testJunitEqualsObject() {

        User user = new User("48092870845", "03572330");
        assertSame(user, user);

        boolean comparacao = new User("48092870845", "03572330").equals( new User("48092870845", "03572330"));
        assertTrue(comparacao);
    }


}