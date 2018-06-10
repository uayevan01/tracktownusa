public class GameObjects
{

	private static Ability[] allFighterSkills = {
			new Ability("Heavy Hit", "Double attack power", 42, 2, true, 1),

			new Ability("Subtract Attack", "More damage the lower the HP", 20, 2, true, 2),

			new Ability("Flash Slash", "Hits all enemies", 48, 3, true, 3),

			new Ability("Shock", "Deals massive damage", 108, 4, true, 4)
	};
	public static Ability[] getAllFighterSkills()
	{
		return allFighterSkills;
	}
	private static Ability[] allNinjaSkills = {
			new Ability("Flames", "Deals damage to all enemies", 20, 1, true, 5),

			new Ability("Flood", "Deals damage to all enemies", 30, 2, true, 6),
			new Ability("Ninja Heal", "Heals all allies", 35, 2, false, 7),

			new Ability("Electrocute", "Deals a lot of damage", 45, 3, true, 8),
			new Ability("Smokescreen", "Increases enemy miss change", 25, 3, true, 9)
	};
	public static Ability[] getAllNinjaSkills()
	{
		return allNinjaSkills;
	}
	private static Ability[] allWizardMagic = {
			new Ability("Icicle", "Deals small damage to one enemy", 24, 1, true, 10),
			new Ability("Gust", "Deals small damage to all enemies", 42, 1, true, 11),

			new Ability("Voltage", "Deals moderate damage to one enemy", 72, 2, true, 12),
			new Ability("Flamethrower", "Deals moderate damage to all enemies", 96, 2, true, 13),

			new Ability("Meteor", "Deals high damage to one enemy", 148, 3, true, 14),
			new Ability("Tsunami", "Deals high damage to all enemies", 192, 3, true, 15),

			new Ability("Fissure", "Deals massive damage to one enemy", 286, 4, true, 16),
			new Ability("Black Hole", "Deals massive damage to all enemies", 364, 4, true, 17)
	};
	public static Ability[] getAllWizardMagic()
	{
		return allWizardMagic;
	}
	private static Ability[] allHealerMagic = {
			new Ability("Heal", "Heals a small amount to an ally", 20, 1, false, 18),

			new Ability("Restore", "Heals a moderate amount to an ally", 46, 2, false, 19),
			new Ability("Revive", "Revives a knocked ally with small HP", 64, 2, false, 20),
			new Ability("All Cure", "Heals a small amount to all allies", 44, 2, false, 21),

			new Ability("Rejuvenate", "Heals a large amount to an ally", 96, 3, false, 22),

			new Ability("Recovery Field", "Heals a large amount to all allies", 184, 4, false, 23),
			new Ability("Renew", "Revives a knocked ally with all HP", 232, 4, false, 24)
	};
	public static Ability[] getAllHealerMagic()
	{
		return allHealerMagic;
	}
	//items
}