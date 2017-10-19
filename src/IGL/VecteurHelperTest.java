package IGL;

import org.junit.Test;

import static org.junit.Assert.*;

public class VecteurHelperTest {

    VecteurHelper vh=new VecteurHelper();

    @Test
    public void sort() throws Exception {


        int tab1[] = new int[]{5,3,4,1,2,88,7};
        int tab2[] = new int[]{1,2,3,4,5,7,88};
        vh.sort(tab1);
        assertArrayEquals(tab1,tab2);

    }

    @Test
    public void reverse() throws Exception {

        int tab1[] = new int[]{1,2,3,4,5,6,7};
        int tab2[] = new int[]{7,6,5,4,3,2,1};
        vh.reverse(tab1);
        assertArrayEquals(tab1,tab2);


    }

}
