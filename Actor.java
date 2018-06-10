import java.awt.image.BufferedImage;

public abstract class Actor {
    protected int maxHealth;
    protected int maxMana;
    protected int currentHealth;
    protected int currentMana;
    protected int maxStrength;
    protected int maxDefense;
    protected int maxMagic;
    protected int maxSpeed;
    protected int strength;
    protected int defense;
    protected int magic;
    protected int speed;
    protected BufferedImage sprite;
    protected boolean isPlayer;
    protected boolean isKnocked;
    abstract void changeHealth(int change);
    public void changeMana(int change)
    {
        if(currentHealth + change > maxHealth) //Prevents over-healing by setting currentHealth to maxHealth if the sum is greater than maxHealth
            currentHealth = maxHealth;
        else
            currentHealth += change; //if change is damage, it is a negative value; if change is healing, it is a positive value
    }
    abstract int getHealth();
    abstract int getStr();
    abstract int getDef();
    public int getMag(){return magic;}
    abstract int getSpd();
    abstract int getMaxHealth();
    abstract boolean isKnocked();
}