package project;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class A1Test {
    @Test
    public void test0()
    {
        String s = "";
        Assertions.assertThat(s).isEmpty();
    }

    @Test
    public void test1()
    {
    }

    @Test
    public void test2()
    {
        String s = "";
        Assertions.assertThat(s.length()).isEqualTo(0);
    }

    @Test
    public void test3()
    {
        A1 a1 = null;
        Assertions.assertThat(a1).isNull();
    }
}
