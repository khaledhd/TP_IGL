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
  
    VecteurHelper vect_hep=new VecteurHelper();


    @Test
    public void minMax() throws Exception {
        int array1[] = new int[]{1,2,3,4,5,6,7};
        int arra2[] = new int[]{1,7};
        assertArrayEquals(vect_hep.minMax(array1),arra2);

    }

    @Test
    public void addArr() throws Exception {
        int array1[] = new int[]{1,2,3,4,5,6,7};
        int array2[] = new int[]{5,5,5,5,5,5,5};
        int array3[] = new int[]{6,7,8,9,10,11,12};
        assertArrayEquals(vect_hep.addArr(array1,array2),array3);
    }

    @Test
    public void multiple() throws Exception {
        int array1[] = new int[]{5,5,5,5,5,5,5};
        int array2[] = new int[]{10,10,10,10,10,10,10};
        vect_hep.multiple(array1);
        assertArrayEquals(array1,array2);

    }

}
