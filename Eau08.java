public class Eau08 {
  public static void main(String[] args){
    /* Déclaration des variables utiles */
    String chaine = "";
    String new_chaine = "";

    /* Vérification des arguements */
    if((args.length != 1) || estUnNombre(args[0]) || (args[0] == "") || !estChaineAlphabet(args[0])){
      System.out.println("Erreur...\nVeillez entrer une chaine !");
    }
    else{
      chaine = args[0];
      /* Création de la nouvelle chaine */
      new_chaine += Character.toUpperCase(chaine.charAt(0));

      int j=1;
      while(j<chaine.length()-1){
        char c = chaine.charAt(j);
        char c_suiv = chaine.charAt(j+1);

        if(Character.isWhitespace(c) || (c=='\t') || (c=='\n')){
          new_chaine += c+""+Character.toUpperCase(c_suiv);
          j +=2;
        }
        else{
          new_chaine += c;
          j++;
        }
      }

      new_chaine += chaine.charAt(chaine.length()-1);

      /* Affichage du résultat */
      System.out.println(new_chaine);
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

  // Méthode qui vérifie si la chaine ne contient que des lettres
  public static boolean estChaineAlphabet(String chaine){
    if(chaine == null)
      return false;
    for (int i=0; i<chaine.length(); i++) {
      char c = chaine.charAt(i);
      if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !Character.isWhitespace(c))
        return false;
    }
    return true;
  }
}
