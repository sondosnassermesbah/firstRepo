package testPackage;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestClass extends BaseTests{
    @Test
    public void test(){
        searchBox.SearchBox("Laptop");
       boolean displayingProduct = searchBox.WaitForElement();
        assertTrue(displayingProduct);
    }
    @Test
    public void SondosFirstTest(){

    }

}
