public class Eau15 {
  public static void main(String[] args){
    String[] tab = new String[args.length];

    /* Vérification des arguements */
    if(args.length <2){
      System.out.println("Erreur...\nVeillez entrer au moins 2 arguments !");
    }
    else{
      /* Remplissage du tableau <tab> à partir du tableau <args> */
      for (int i=0; i<tab.length; i++) {
        tab[i] = args[i];
      }

      int min = 0;
      String tmp = "";
      int taille_tab = tab.length;

      /* Tri du tableau  */
      for (int i=0; i < taille_tab-1; i++) {
        min = i;
        for (int j=i+1; j<taille_tab; j++) {
          if (tab[j].charAt(0) < tab[min].charAt(0)) {
            min = j;
          }
        }
        if (min != i) {
          tmp = tab[i];
          tab[i] = tab[min];
          tab[min] = tmp;
        }
      }

      /* Affichage du résultat */
      for (int i=0; i<tab.length; i++) {
        System.out.print(tab[i]+" ");
      }
      System.out.println();
    }
  }

  // Méthode qui vérifie s'il sagit d'un nombre
  public static boolean estUnNombre(String chaine){
    try{
      Integer.parseInt(chaine);
    }
    catch(NumberFormatException e){
      return false;
    }
    return true;
  }

  // Méthode pour vérifier que le tableau ne contient que des entiers
  public static boolean estTabEntier(String[] tab){
    for (int i=0; i<tab.length; i++) {
      if (!estUnNombre(tab[i])) {
        return false;
      }
    }
    return true;
  }
}
