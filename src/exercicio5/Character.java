package exercicio5;

public abstract class Character {
    private String name;
    private int hp;

    public Character(String name) {
        this.name = name;
    }

    public void attack(Character target){
        System.out.println("attacking");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }
}
