package exercicio5;

public class Warrior extends Character{
    private String weapon = "sword";
    private int hp = 150;
    private int strength = 60;

    public Warrior(String name) {
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
