package factory;

public class ChickenFactory {
    public static chkInterface getChicken(String criteria){
        if(criteria.equals("Lotte")) return new chk1();
        else if (criteria.equals("BBQ"))return new chk2();
        else if (criteria.equals("Kyochon"))return new chk3();
        return null;
    }
    
}

