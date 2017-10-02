package tests;

import static org.junit.Assert.assertEquals;


public class TestFileTest {
    @org.junit.Test
    public void readfile(){
        TestFileTest greaterthree = new TestFile("./filesfortests/greaterthree.txt");
        assetEquals("more than 3 lines", 1, greaterthree.readfile());

        TestFileTest lessthree = new TestFile("./filefortests/lessthree.txt");
        assertEquals("less than 3 lines", 1, lessthree.readfile());

        TestFileTest invalidcoordinate = new TestFile("./filefortests/invalidcoordinate.txt");
        assertEquals("invalid coordinate format", 1, invalidcoordinate.readfile());

        TestFileTest validfile = new TestFile("./filesfortests/validtest.txt");
        assertEquals("valid file test pass", 0, validfile.readfile());
    }


}

