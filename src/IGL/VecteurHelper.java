package IGL;

/**
 * Created by fat on 19/10/2017.
 */
public class VecteurHelper {



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
