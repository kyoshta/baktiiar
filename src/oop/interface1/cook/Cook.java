package oop.interface1.cook;

public interface Cook {
    public abstract String cookSushi();

    default String cookFastFood(String nameFood){
        addSalt();
        return nameFood;
    }
    static boolean cookItalianFood(String foodName){

        boolean food = false;
        if (foodName.equalsIgnoreCase("pasta")){

            food = true;
            addSalt();
        }
        else if (foodName.equalsIgnoreCase("tiramisu")){
            food = true;
        }
        return food;
    }
    private static void addSalt(){
        System.out.println("to salt");
    }

    String cookFastFood();
}
