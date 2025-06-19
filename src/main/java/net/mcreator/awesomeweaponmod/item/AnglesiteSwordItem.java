
package net.mcreator.awesomeweaponmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.awesomeweaponmod.init.AwesomeweaponmodModItems;

public class AnglesiteSwordItem extends SwordItem {
	public AnglesiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 10512;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AwesomeweaponmodModItems.ANGLESITE.get()));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}
}
