package factory;

public class ChickenTest {
    public static void main(String[] ar){
        chkInterface lotte = ChickenFactory.getChicken("Lotte");
        chkInterface bbq = ChickenFactory.getChicken("BBQ");
        chkInterface kyochon = ChickenFactory.getChicken("Kyochon");
        lotte.getPrice();
        bbq.getPrice();
        kyochon.getPrice();
        
/*		Factory pattern�� ���� �ʴ´ٸ� test class�� �ּ�ó���� �κ�ó�� ������ �ؾ��Ѵ�.
        Chicken lotte1 = new LotteChicken();
        Chicken bbq1 = new BBQ();
        Chicken kyochon1 = new Kyochon();
        lotte.getPrice();
        bbq.getPrice();
        kyochon.getPrice();
*/
    }
}

