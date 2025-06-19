
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.awesomeweaponmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.awesomeweaponmod.potion.RangeMobEffect;
import net.mcreator.awesomeweaponmod.potion.PoisonDecayMobEffect;
import net.mcreator.awesomeweaponmod.potion.CrystalizeMobEffect;
import net.mcreator.awesomeweaponmod.AwesomeweaponmodMod;

public class AwesomeweaponmodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AwesomeweaponmodMod.MODID);
	public static final RegistryObject<MobEffect> POISON_DECAY = REGISTRY.register("poison_decay", () -> new PoisonDecayMobEffect());
	public static final RegistryObject<MobEffect> CRYSTALIZE = REGISTRY.register("crystalize", () -> new CrystalizeMobEffect());
	public static final RegistryObject<MobEffect> RANGE = REGISTRY.register("range", () -> new RangeMobEffect());
}
