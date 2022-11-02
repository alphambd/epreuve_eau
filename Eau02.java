public class Eau02 {
  public static void main(String[] args){
    int born_sup = 9;
    String separateur = ", ";
    
    for (int i=0; i<=born_sup; i++) {
      for (int j=0; j<=born_sup; j++) {
        for (int k=0; k<=born_sup; k++) {
          for (int l=1; l<=born_sup; l++) {
            if (j < l) {
              // gestion des séparateurs
              if(i==9 && j==8 && k==9 && l==9){
                separateur = "";
              }
              System.out.print(i+""+j+" "+k+""+l+separateur);
            }
          }
        }
      }
    }
    System.out.println();
  }

}
