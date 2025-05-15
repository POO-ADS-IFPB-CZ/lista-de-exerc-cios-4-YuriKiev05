package exercicio5;

public class Wizard extends Character{
    private String weapon = "staff";
    private int hp = 90;
    private int strength = 45;

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attack(Character target){
        target.setHp(target.getHp() - strength);

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
