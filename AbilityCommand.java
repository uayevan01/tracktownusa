public class AbilityCommand extends Command
{
    Ability ability;
    public AbilityCommand(Actor a, Actor[] ab, Ability ability)
    {
        super(a, ab);
        this.ability = ability;
    }
    @Override
    public int calculateEffect()
    {
        int change = 1;
        if(ability.getCode() == 1)
            change = (int) ((caster.getStr() * 2) - (currentTarget.getDef() * Math.random() * .25));
        else if(ability.getCode() == 2)
            change = (int) (Math.random() * .4 + 1)*(caster.maxHealth - caster.currentHealth);
        else if(ability.getCode() == 18)
            change = (int) (caster.getMag() * (1 + Math.random() * .5));
        else if(ability.getCode() == 19)
            change = (int) (caster.getMag() * (2 + Math.random() * .5));
        else if(ability.getCode() == 20)
            change = (int) (targets[currentIndex].getMaxHealth() * .33);
        else if(ability.getCode() == 21)
            change = (int) (caster.getMag() * (1 + Math.random() * .33));

        if(ability.doesDamage())
            change *= -1;
        return change;
    }


    public void execute()
    {
        caster.changeMana(-1 * ability.getCost());
        while(currentIndex >= targets.length)
        {
            currentTarget = targets[currentIndex];
            if(currentTarget.isKnocked() && ability.getCode() != 20)
            {
                change = 0;
                return;
            }
            else
            {
                change = calculateEffect();
            }
            currentTarget.changeHealth(change);
            currentIndex ++;
        }
    }
}