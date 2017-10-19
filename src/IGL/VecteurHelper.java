package IGL;

public class VecteurHelper {

  /**
   * Trier un Vecteur en ordre croissant
   * @param arr Vecteur a trier
   */
  public void sort(int[] arr){

       boolean stop = false ;
       int i = 0 ;
       while(!stop){
           if (arr[i] > arr[i+1]) {
               int c = arr[i] ;
               arr[i] = arr[i+1];
               arr[i+1] = c;
               i = 0 ;
           } else {
               i++ ;
               if (i > arr.length) {
                   stop = true ;
               }
           }
       }

   }

   /**
    * Inverser les elements du Vecteur
    * @param tab Vecteur a inverser
    */
   public void reverse(int[] tab){
      int c;
      int j = tab.length - 1 ;
       for (int i = 0; i < (tab.length)/2; i++) {
           c= tab[j];
           tab[j]=tab[i];
           tab[i]=c;
           j-- ;
       }

   }
}
