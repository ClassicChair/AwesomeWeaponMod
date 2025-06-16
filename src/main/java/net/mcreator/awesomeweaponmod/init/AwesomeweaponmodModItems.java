
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.awesomeweaponmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.awesomeweaponmod.item.BattlePanItem;
import net.mcreator.awesomeweaponmod.AwesomeweaponmodMod;

public class AwesomeweaponmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AwesomeweaponmodMod.MODID);
	public static final RegistryObject<Item> BATTLE_PAN = REGISTRY.register("battle_pan", () -> new BattlePanItem());
	// Start of user code block custom items
	// End of user code block custom items
}
