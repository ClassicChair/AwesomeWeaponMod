package net.mcreator.awesomeweaponmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.awesomeweaponmod.init.AwesomeweaponmodModMobEffects;
import net.mcreator.awesomeweaponmod.init.AwesomeweaponmodModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AnglesiteSwordBuildUpCrystalizeProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AwesomeweaponmodModItems.ANGLESITE_SWORD.get()) {
			if (sourceentity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(AwesomeweaponmodModMobEffects.CRYSTALIZE.get())) {
				if ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(AwesomeweaponmodModMobEffects.CRYSTALIZE.get()) ? _livEnt.getEffect(AwesomeweaponmodModMobEffects.CRYSTALIZE.get()).getAmplifier() : 0) < 9) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(AwesomeweaponmodModMobEffects.CRYSTALIZE.get(), 1200,
								(int) ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(AwesomeweaponmodModMobEffects.CRYSTALIZE.get()) ? _livEnt.getEffect(AwesomeweaponmodModMobEffects.CRYSTALIZE.get()).getAmplifier() : 0) + 1)));
				}
			} else {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(AwesomeweaponmodModMobEffects.CRYSTALIZE.get(), 1200, (int) 0.5));
			}
		}
	}
}
