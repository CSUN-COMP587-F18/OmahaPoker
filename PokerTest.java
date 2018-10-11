import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class HandTest {
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
    public void testRainbowOnePlayer(){
        String [] args={"2c", "3c","4c","2s","3s", "5h", "8d", "jd", "7d", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),2);
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
    public void testMonochromaticOnePlayer(){
        String [] args={"2c", "3c","4c","Kc","jc", "5s", "Ks", "js", "7s", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),4);
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
    public void testMonarchyOnePlayer(){
        String [] args={"2c", "3c","4c","jd","Qd", "5h", "Kd", "5d", "7d", "8c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),6);
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
    public void testOddOnePlayer(){
        String [] args={"3c", "3s","5c","7s","Qs", "4h", "Kd", "Qd", "9d", "9c"};
        players=Poker.setCards(args,players,numplayers);
        numplayers=players.size();
        Poker.rank(numplayers,players);
        Assert.assertEquals(players.get(0).getrank(),8);
    }

}
