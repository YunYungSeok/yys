package factory;

public class ChickenTest {
    public static void main(String[] ar){
        chkInterface lotte = ChickenFactory.getChicken("Lotte");
        chkInterface bbq = ChickenFactory.getChicken("BBQ");
        chkInterface kyochon = ChickenFactory.getChicken("Kyochon");
        lotte.getPrice();
        bbq.getPrice();
        kyochon.getPrice();
        
/*		Factory pattern을 쓰지 않는다면 test class의 주석처리된 부분처럼 구현을 해야한다.
        Chicken lotte1 = new LotteChicken();
        Chicken bbq1 = new BBQ();
        Chicken kyochon1 = new Kyochon();
        lotte.getPrice();
        bbq.getPrice();
        kyochon.getPrice();
*/
    }
}

