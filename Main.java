Main Class
import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Deck deck = new Deck();
    boolean inGame= true;
    deck.shuffle();
    deck.split();

    char Picon;
    char Pnum;
    String Pboth;

    char Cicon;
    char Cnum;
    String Cboth;

    while(inGame){
      System.out.println("          <Player>      <CPU>\n");
      System.out.println("           ? ——— ?          ? ——— ?");
      System.out.println("           |  ?  |          |  ?  |");
      System.out.println("           ? ——— ?          ? ——— ?");

      deck.battle();
   
      Picon = deck.getPlayerCard().toString().charAt(2);
      Pnum = deck.getPlayerCard().toString().charAt(0);
      Pboth = deck.getPlayerCard().toString();
      
      Cicon = deck.getComputerCard().toString().charAt(2);
      Cnum = deck.getComputerCard().toString().charAt(0);
      Cboth = deck.getComputerCard().toString();
        
      //System.out.println("          <Player>          <CPU>\n");
      System.out.println("           "+Picon+" ——— "+Pnum+"          "+Cicon+" ——— "+Cnum);
      System.out.println("           | "+Pboth+" |  //VS//  | "+Cboth+" |");
      System.out.println("           "+Pnum+" ——— "+Picon+"          "+Cnum+" ——— "+Cicon);

      System.out.println("          ----------          \n");

      int winner = deck.realBattle();
      
      if(winner == 0){
        System.out.println("           "+Picon+" ——— "+Pnum+"          "+Cicon+" ——— "+Cnum);
        System.out.println("           | "+Pboth+" |  Winner >| "+Cboth+" |");
        System.out.println("           "+Pnum+" ——— "+Picon+"          "+Cnum+" ——— "+Cicon);

      }else if(winner == 1){
        System.out.println("           "+Picon+" ——— "+Pnum+"          "+Cicon+" ——— "+Cnum);
        System.out.println("           | "+Pboth+" |  < Winner| "+Cboth+"|");
        System.out.println("           "+Pnum+" ——— "+Picon+"          "+Cnum+" ——— "+Cicon);

      }else{
        System.out.println("           "+Picon+" ——— "+Pnum+"          "+Cicon+" ——— "+Cnum);
        System.out.println("           | "+Pboth+" |    War   | "+Cboth+"|");
        System.out.println("           "+Pnum+" ——— "+Picon+"          "+Cnum+" ——— "+Cicon);
      }
      System.out.println("\n Player Cards: "+deck.getPlayerDeck().size()+"Computer Cards: "+deck.getComputerDeck().size()+"\n");

      System.out.println("----------Press Enter Clear Table---------");
      scanner.nextLine();
      
      if(deck.getPlayerDeck().size() == 0 || deck.getComputerDeck().size() == 0){
        inGame = false;
      }
      
    }
  }
}
