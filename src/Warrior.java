public  class  Warrior extends Hero{
    public Warrior(int Health, int Damage, String Flying) {
        super(Health, Damage, Flying);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE ");

    }
}
