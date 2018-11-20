import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class PokerTest {
    ArrayList<Player> players= new ArrayList<Player>();
    int numplayers=0;

    //starting hand 2c 3c 4c 2s 3s 5d 8d jd 7d 8c
    //hearts, diamonds, clubs, spades
    //0,1,2,3

    @Test
    public void testNonRainbowOnePlayer(){
        String [] args={"2c", "3c","4c","2s","3s", "5d", "8d", "jd", "7d", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),1);
    }
    @Test
    public void testNonRainbowMultiplePlayer(){
        String [] args={"2c", "3c","4c","2s","3s", "5d", "8d", "jd", "7d", "8c","7s","9d","3d","4d","6d"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),1);
        Assert.assertEquals(players.get(1).getrank(),1);
    }
    @Test
    public void testRainbowOnePlayer(){
        String [] args={"2c", "3c","4c","2s","3s", "5h", "8d", "jd", "7d", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),2);
    }
    @Test
    public void testRainbowMultiplePlayer(){
        String [] args={"2c", "3c","4c","2s","3s", "5h", "8d", "jd", "7d", "8c","3h","8h","4d", "5d","6h"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),2);
        Assert.assertEquals(players.get(1).getrank(),2);

    }
    @Test
    public void testSwingersOnePlayer(){
        String [] args={"2c", "3c","4c","Ks","Qs", "5h", "Kd", "Qd", "7d", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),3);
    }
    @Test
    public void testSwingersMultiplePlayer(){
        String [] args={"2c", "3c","4c","Ks","Qs", "5h", "Kd", "Qd", "7d", "8c","Kh","Qh","9s","9h","8h"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),3);
        Assert.assertEquals(players.get(1).getrank(),3);
    }
    @Test
    public void testMonochromaticOnePlayer(){
        String [] args={"2c", "3c","4c","Kc","jc", "5s", "Ks", "js", "7s", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),4);
    }
    @Test
    public void testMonochromaticMultiplePlayer(){
        String [] args={"2c", "3c","4c","Kc","jc", "5s", "Ks", "js", "7s", "8c","2s","3s","4s","6s","7c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),4);
        Assert.assertEquals(players.get(1).getrank(),4);

    }
    @Test
    public void test3PairOnePlayer(){
        String [] args={"2c", "3c","4c","4s","Qs", "7h", "4d", "3d", "Qd", "2s"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),5);
    }
    @Test
    public void test3PairMultiplePlayer(){
        String [] args={"2c", "3c","4c","4s","Qs", "7h", "4d", "3d", "Qd", "2s","Qh","2d","7s","3h","9s"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),5);
        Assert.assertEquals(players.get(1).getrank(),5);
    }
    @Test
    public void testMonarchyOnePlayer(){
        String [] args={"2c", "3c","4c","jd","Qd", "5h", "Kd", "5d", "7d", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),6);
    }
    @Test
    public void testMonarchyMultiplePlayer(){
        String [] args={"2c", "kh","jh","jd","Qd", "5h", "Kd", "5d", "7d", "8c","Qh","2s","3s","3d","4h"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),6);
        Assert.assertEquals(players.get(1).getrank(),6);

    }
    @Test
    public void testEvenOnePlayer(){
        String [] args={"2c", "2s","4c","6s","Qs", "5h", "Kd", "Qd", "Td", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),7);
    }
    @Test
    public void testEvenMultiplePlayer(){
        String [] args={"2c", "2s","4c","6s","Qs", "5h", "Kd", "Qd", "Td", "8c","2d","4h","6h","ts","tc"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),7);
        Assert.assertEquals(players.get(1).getrank(),7);


    }
    @Test
    public void testOddOnePlayer(){
        String [] args={"3c", "3s","5c","7s","Qs", "4h", "Kd", "Qd", "9d", "9c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),8);
    }
    @Test
    public void testOddMultiplePlayer(){
        String [] args={"3c", "3s","5c","7s","Qs", "4h", "Kd", "Qd", "9d", "9c","3d","5d","7d","6h","9h"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),8);
        Assert.assertEquals(players.get(1).getrank(),8);
    }
    @Test
    public void testFlushOnePlayer(){
        String [] args={"3c", "4c","5c","7s","Qs", "4h", "Kd", "Qc", "9c", "9c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),9);
    }
    @Test
    public void testFlushMultiplePlayer(){
        String [] args={"3c", "4c","5c","7s","Qs", "4h", "Kd", "Qc", "9c", "9c","6c","Tc","2c","Th","5h"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),9);
        Assert.assertEquals(players.get(1).getrank(),9);
    }
    @Test
    public void testTripletsOnePlayer(){
        String [] args={"3d", "3h","3s","7s","Qs", "4h", "Kd", "Qc", "7h", "7c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),10);
    }
    @Test
    public void testTripletsMultiplePlayer(){
        String [] args={"3d", "3h","3s","7s","Qs", "4h", "Kd", "Qc", "7h", "7c","5h","5s","5c","th","td"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),10);
        Assert.assertEquals(players.get(1).getrank(),10);
    }
    @Test
    public void testOverfullHouseOnePlayer(){
        String [] args={"3c", "3h","3s","3d","Qs", "4h", "Kd", "Qc", "9c", "9s"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),11);
    }
    @Test
    public void testOverfullHouseMultiplePlayers(){
        String [] args={"3c", "3h","3s","3d","Qs", "4h", "Kd", "Qc", "9c", "9s","6s","6h","th","td","kh"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),11);
        Assert.assertEquals(players.get(0).getrank(),11);
    }
    @Test
    public void testHomoSapiensOnePlayer(){
        String [] args={"jh", "qs","kd","js","Qh", "4h", "Kd", "Qc", "9c", "3d"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),12);
    }
    @Test
    public void testHomoSapiensMultiplePlayers(){
        String [] args={"jh", "qs","kd","js","Qh", "4h", "Kh", "Qc", "9c", "3d","ks","kc","5s","6h","4s"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),12);
        Assert.assertEquals(players.get(1).getrank(),12);
    }
    @Test
    public void testKingdomOnePlayer(){
        String [] args={"jh", "qh","kh","th","Qs", "4h", "Kd", "Qc", "9h", "3h"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),13);
    }
    @Test
    public void testOrgyOnePlayer(){
        String [] args={"jc", "jh","js","9s","Qs", "4h", "Kd", "Qc", "qh", "3d"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),14);
    }
    @Test
    public void testOrgyMultiplePlayers(){
        String [] args={"jc", "jh","js","9s","Qs", "4h", "Kd", "Qc", "qh", "3d","jd","qd","td","th","ts"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),14);
        Assert.assertEquals(players.get(1).getrank(),14);

    }
    @Test
    public void testPoliticsOnePlayer(){
        String [] args={"jh", "qh","kh","js","th", "4h", "td", "Qs", "ks", "3d"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),15);
    }
    @Test
    public void testPoliticsMultiplePlayers(){
        String [] args={"jh", "qh","kh","js","th", "4h", "td", "Qs", "ks", "3d","jd","qd","kd","4d","5d"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),15);
        Assert.assertEquals(players.get(1).getrank(),15);

    }
    @Test
    public void testDinnerPartyOnePlayer(){
        String [] args={"qh", "qd","ks","9s","Qs", "4h", "Kd", "Js", "kh", "3d"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),16);
    }
    //Automated testing
    //This function is called to run nonrainbow tests for all possible nonrainbow hands ( Assuming 3 suits )
    public void nonRainbowHelper(String[] args, String[] suits){
        //String[] suits = {"c", "h", "d"};
        int z=0;
        //Hand generation
        for (int i=2;i<=14;i++){
            args[0]=String.valueOf(i%13) + suits[z];
            args[1]=String.valueOf((i+1)%13) + suits[z+1];
            args[2]=String.valueOf((i+2)%13) + suits[z+2];
            args[3]=String.valueOf((i+3)%13) + suits[z];
            args[4]=String.valueOf((i+4)%13) + suits[z+1];
            args[5]=String.valueOf((i+5)%13) + suits[z+2];
            args[6]=String.valueOf((i+6)%13) + suits[z];
            args[7]=String.valueOf((i+7)%13) + suits[z+1];
            args[8]=String.valueOf((i+8)%13) + suits[z+2];
            args[9]=String.valueOf((i+9)%13) + suits[z];
            //Checking for tens, convert to value ten (t)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('1') && args[j].charAt(1).equals('0')){
                    String newCard=args[j].substring(2);
                    args[j]="t"+ newCard;
                }
            //Checking for 11, convert to value ten (j)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('1') && args[j].charAt(1).equals('1')){
                    String newCard=args[j].substring(2);
                    args[j]="j"+ newCard;
                }
            //Checking for 12, convert to value ten (q)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('1') && args[j].charAt(1).equals('2')){
                    String newCard=args[j].substring(2);
                    args[j]="q"+ newCard;
                }
            //Checking for 0, convert to value ten (k)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('0')){
                    String newCard=args[j].substring(2);
                    args[j]="k"+ newCard;
                }
            //Checking for ones, convert to value two (2)
                if (args[j].charAt(0).equals('1')){
                    String newCard=args[j].substring(1);
                    args[j]="2"+ newCard;
                }
            }
            //end hand generation, Test generated hand now
            players = Poker.setCards(args,players,numplayers);
            numplayers=players.size();
            Poker.rank(numplayers,players);
            Assert.assertEquals(players.get(0).getrank(),1);
        }
    }
    @Test
    public void testNonRainbowOnePlayerAutomated(){
        //Omitted one suit
        String[] args= new String[10];
        String[] suits= {"c", "h", "d"};
        nonRainbowHelper(args,suits);
        suits[0]="s";
        nonRainbowHelper(args,suits);
        suits[1]="c";
        nonRainbowHelper(args,suits);
        suits[2]="h"
        nonRainbowHelper(args,suits);
    }
    //Automated testing
    //This helper will work for any hands that use 4 suits
    public int[] fourSuitHelper(String[] args, String[] suits){
        //String[] suits = {"c", "h", "d","s"};
        int z=0;
        int [] solution = new solution[13];
        //Hand generation
        for (int i=2;i<=14;i++){
            args[0]=String.valueOf(i%13) + suits[z];
            args[1]=String.valueOf((i+1)%13) + suits[z+1];
            args[2]=String.valueOf((i+2)%13) + suits[z+2];
            args[3]=String.valueOf((i+3)%13) + suits[z+3];
            args[4]=String.valueOf((i+4)%13) + suits[z];
            args[5]=String.valueOf((i+5)%13) + suits[z+1];
            args[6]=String.valueOf((i+6)%13) + suits[z+2];
            args[7]=String.valueOf((i+7)%13) + suits[z+3];
            args[8]=String.valueOf((i+8)%13) + suits[z];
            args[9]=String.valueOf((i+9)%13) + suits[z+1];
            //Checking for tens, convert to value ten (t)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('1') && args[j].charAt(1).equals('0')){
                    String newCard=args[j].substring(2);
                    args[j]="t"+ newCard;
                }
            //Checking for 11, convert to value ten (j)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('1') && args[j].charAt(1).equals('1')){
                    String newCard=args[j].substring(2);
                    args[j]="j"+ newCard;
                }
            //Checking for 12, convert to value ten (q)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('1') && args[j].charAt(1).equals('2')){
                    String newCard=args[j].substring(2);
                    args[j]="q"+ newCard;
                }
            //Checking for 0, convert to value ten (k)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('0')){
                    String newCard=args[j].substring(2);
                    args[j]="k"+ newCard;
                }
            //Checking for ones, convert to value two (2)
                if (args[j].charAt(0).equals('1')){
                    String newCard=args[j].substring(1);
                    args[j]="2"+ newCard;
                }
            }
            //end hand generation, Test generated hand now
            players = Poker.setCards(args,players,numplayers);
            numplayers=players.size();
            Poker.rank(numplayers,players);
            solution[i-2]= players.get(0).getrank();
        }
        return solution;
    }
    @Test
    public void testRainbowOnePlayerAutomated(){
        String[] args=new String[10];
        String[] suits = {"c", "h", "d","s"};
        int [] solutions = fourSuitHelper(args,suits);
        for (int i = 0; i<=12; i++){
            Assert.assertEquals(solutions[i],2);
        }
    }

    @Test
    public void testMonochromaticOnePlayerAutomated(){
        String[] args=new String[10];
        String[] Blacksuits = {"c","s"};
        String[] Redsuits ={"h", "d"};
    }
    //Automated testing
    public void evenOddHelper(String[] args, String[] suits){
        //String[] suits = {"c", "h", "d", "s"};
        int z=0;
        //Hand generation
        for (int i=2;i<=14;i++){
            args[0]=String.valueOf(i%10) + suits[z];
            args[1]=String.valueOf((i+2)%10) + suits[z+1];
            args[2]=String.valueOf((i+4)%10) + suits[z+2];
            args[3]=String.valueOf((i+6)%10) + suits[z];
            args[4]=String.valueOf((i+8)%10) + suits[z+1];
            args[5]=String.valueOf((i+10)%10) + suits[z+2];
            args[6]=String.valueOf((i+12)%10) + suits[z+1];
            args[7]=String.valueOf((i+14)%10) + suits[z+2];
            args[8]=String.valueOf((i+16)%10) + suits[z+2];
            args[9]=String.valueOf((i+18)%10) + suits[z];
            //Checking for tens, convert to value ten (t)
            for (int j=0; j<10;j++){
                if (args[j].charAt(0).equals('1') && args[j].charAt(1).equals('0')){
                    String newCard=args[j].substring(2);
                    args[j]="t"+ newCard;
                }
            //Checking for ones, convert to value two (2)
                if (args[j].charAt(0).equals('1')){
                    String newCard=args[j].substring(1);
                    args[j]="2"+ newCard;
                }
            }
            //end hand generation, Test generated hand now
            players = Poker.setCards(args,players,numplayers);
            numplayers=players.size();
            Poker.rank(numplayers,players);
        }
    }

    @Test
    public void testEvenOnePlayerAutomated(){


    }
}
