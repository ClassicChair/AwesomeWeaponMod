
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.awesomeweaponmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.awesomeweaponmod.AwesomeweaponmodMod;

public class AwesomeweaponmodModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AwesomeweaponmodMod.MODID);
	public static final RegistryObject<SimpleParticleType> PAN_SMASH = REGISTRY.register("pan_smash", () -> new SimpleParticleType(true));
}
