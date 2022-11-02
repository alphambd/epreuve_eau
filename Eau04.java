public class Eau04 {
  public static void main(String[] args){
    int indice = 0; // variable pour contenir l'indice du nombre
    int[] termesFibo = nPremiersTermesFibo(1000);

    if((args.length != 1) || (!estUnNombre(args[0])) || Integer.parseInt(args[0])<0){
      System.out.println("Erreur...\nVeillez un entier (l'indice) >0, pour trouver le nombre de Fibonacci correspondant !");
    }
    else{
      indice = Integer.parseInt(args[0]);
      System.out.println(termesFibo[indice]);
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

  // Méthode pour trouver les N premiers termes de la suite Fibonacci
  public static int[] nPremiersTermesFibo(int n){
    int[] listeNTermes = new int[n];
    if (n>0)
      listeNTermes[0] = 0;
    if (n>1)
      listeNTermes[1] = 1;
    if (n>=2) {
      for (int i=2; i<n; i++) {
        listeNTermes[i] = listeNTermes[i-1] + listeNTermes[i-2];
      }
    }
    return listeNTermes;
  }
}
