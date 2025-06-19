
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.awesomeweaponmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.awesomeweaponmod.client.particle.PanSmashParticle;
import net.mcreator.awesomeweaponmod.client.particle.AnglesiteCrystalShieldParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AwesomeweaponmodModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(AwesomeweaponmodModParticleTypes.PAN_SMASH.get(), PanSmashParticle::provider);
		event.registerSpriteSet(AwesomeweaponmodModParticleTypes.ANGLESITE_CRYSTAL_SHIELD.get(), AnglesiteCrystalShieldParticle::provider);
	}
}
