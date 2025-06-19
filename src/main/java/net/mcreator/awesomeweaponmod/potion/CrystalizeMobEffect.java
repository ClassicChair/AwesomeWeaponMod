
package net.mcreator.awesomeweaponmod.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

public class CrystalizeMobEffect extends MobEffect {
	public CrystalizeMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -4526081);
		this.addAttributeModifier(Attributes.ARMOR, "e0614c9c-a194-3e73-b625-5ad2ae1c6768", 1, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "3c43966b-b5f0-3f7b-80c3-7be97d448266", 1, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, "4eb10c13-35a0-33ed-b648-701e7a2b1144", 1, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
