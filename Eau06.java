public class Eau06 {
  public static void main(String[] args){
    /* Déclaration des variables utiles */
    String chaine1 = "";
    String chaine2 = "";
    char debut_chaine2 = ' ';
    int longeur_chaine2 = 0;
    boolean ch2_dans_ch1 = false;

    /* Vérification des arguements */
    if((args.length != 2) || estUnNombre(args[0])){
      System.out.println("Erreur...\nVeillez entrer deux chaines !");
    }
    else{
      chaine1 = args[0];
      chaine2 = args[1];
      debut_chaine2 = chaine2.substring(0,1).toCharArray()[0];
      longeur_chaine2 = chaine2.length();

      /* Traitement des chaines */
      String reste_chaine1 = "";
      String sous_chaine1 = "";
      int pos_c_chaine1 = 0;
      for (char c : chaine1.toCharArray()) {
        pos_c_chaine1 = chaine1.indexOf(c);
        reste_chaine1 = chaine1.substring(pos_c_chaine1,chaine1.length());
        if (c == debut_chaine2 && (longeur_chaine2 <= reste_chaine1.length())) {
          sous_chaine1 = chaine1.substring(pos_c_chaine1, pos_c_chaine1+longeur_chaine2);
          if(chaine2.equals(sous_chaine1)){
            ch2_dans_ch1 = true;
          }
        }
      }

      /* Affichage du résultat */
      System.out.println(ch2_dans_ch1);
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
}
