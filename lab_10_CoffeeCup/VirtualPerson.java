package lab_10_CoffeeCup;

public class VirtualPerson {
    private final int toolCold = 65;
    private final int toolHot = 85;
    public void drinkCoffee(CoffeeCup cup) throws TemperatureException {
        int tmp = cup.getTemperature();
        if(tmp>toolHot) throw new ToolHotException("Coffee quá nóng | Nhiệt độ: "+tmp+"°C");
        else if(tmp<toolCold) throw new ToolCoolException("Coffee quá lạnh | Nhiệt độ: "+tmp+"°C");
        System.out.println("Coffee ngon !");
    }
    public static void main(String []args)
    {
        CoffeeCup cup = new CoffeeCup();
        VirtualPerson person = new VirtualPerson();

        cup.setTemperature(70);

        try{
            person.drinkCoffee(cup);
        } catch (TemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}
