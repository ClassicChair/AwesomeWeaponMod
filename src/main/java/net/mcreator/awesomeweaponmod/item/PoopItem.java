
package net.mcreator.awesomeweaponmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PoopItem extends Item {
	public PoopItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
