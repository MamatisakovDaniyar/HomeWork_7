public class Medic extends Hero{
   private int healPoints;

    public Medic(int Health, int Damage, String Flying, int healPoints) {
        super(Health, Damage, Flying);
        this.healPoints=healPoints;
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Медик применил супер спасобность Heal ");

    }
    public void increaseExperience(){
        healPoints+=(int) (healPoints * 0.1);
    }
}
