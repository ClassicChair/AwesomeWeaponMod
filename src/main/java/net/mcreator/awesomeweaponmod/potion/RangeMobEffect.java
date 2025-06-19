
package net.mcreator.awesomeweaponmod.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

public class RangeMobEffect extends MobEffect {
	public RangeMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		this.addAttributeModifier(ForgeMod.BLOCK_REACH.get(), "4e2be073-d92e-3741-867a-42edb02e450f", 1, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.ENTITY_REACH.get(), "e195a150-5212-304b-886a-174586a2464c", 1, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.MILK_BUCKET));
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		cures.add(new ItemStack(Items.HONEY_BOTTLE));
		return cures;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
