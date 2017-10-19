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


    /**
     * Extraire le Min et le Max d'un Vecteur
     * @param tab  Vecteur a traiter
     * @return Un tableau de deux cases contenant le Min et le MAx
     */
    public  int[] minMax(int[] tab) {
        int minn = tab[0];
        int maxx = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < minn) {
                minn = tab[i];
            }
            if (tab[i] > maxx) {
                maxx = tab[i];
            }

        }
        int t[]=new int[2] ;
        t[0]=minn;
        t[1]=maxx;
        return  t;

    }

    /**
     * Effectuer l'addition de deux Vecteurs
     * @param tab1 Premier Vecteur
     * @param tab2 Deuxieme Vecteur
     * @return  Un tableau contenant le resultat de la somme
     */
    public  int[] addArr(int[] tab1,int[] tab2) {

      if(tab1.length!=tab2.length) {
      return null;
      }
      else
      {
          int resultat[]=new int [tab1.length];
          for(int i=0;i<tab1.length;i++)
          {
              resultat[i]=tab1[i]+tab2[i];

          }
          return resultat;
      }
    }
    /**
     * Effectuer la Multiplication des elements d'un Vecteur par deux
     * @param tab Vecteur a traiter
     */
    public void multiple(int [] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] *= 2 ;
        }
    }
}
