package exercicio5;

public class Archer extends Character{
    private String weapon = "bow";
    private int hp = 120;
    private int strength = 50;

    public Archer(String name) {
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
