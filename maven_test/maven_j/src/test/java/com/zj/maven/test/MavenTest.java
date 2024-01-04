package com.zj.maven.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MavenTest {
@Test
public void testAssert(){
    int a = 10;
    int b = 30;
    Assertions.assertEquals(a+b, 40);
}

}
