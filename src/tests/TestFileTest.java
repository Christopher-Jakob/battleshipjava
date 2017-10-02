package tests;

import static org.junit.Assert.*;

/**
 * Created by rickus on 10/1/17.
 */
public class TestFileTest {
    @org.junit.Test
    public void readfile(){
        TestFileTest greaterthree = new TestFileTest("/filesfortests/greaterthree.txt");
        assetEquals("more than 3 lines", 1, greaterthree.readfile());
    }

}

