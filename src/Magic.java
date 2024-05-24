public class Magic extends Hero{
    public Magic(int Health, int Damage, String Flying ){
        super(Health,Damage, Flying);
    }

    @Override
    public void applySuperAbility() {
        System.out.println(" Маг прменил супер спасобность Fire ");
     }
}
