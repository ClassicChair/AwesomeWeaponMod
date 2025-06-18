
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.awesomeweaponmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.awesomeweaponmod.item.VenomshankItem;
import net.mcreator.awesomeweaponmod.item.DiamondBattlePanItem;
import net.mcreator.awesomeweaponmod.item.BigSwordItem;
import net.mcreator.awesomeweaponmod.item.BattlePanItem;
import net.mcreator.awesomeweaponmod.item.AnglesiteItem;
import net.mcreator.awesomeweaponmod.AwesomeweaponmodMod;

public class AwesomeweaponmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AwesomeweaponmodMod.MODID);
	public static final RegistryObject<Item> BATTLE_PAN = REGISTRY.register("battle_pan", () -> new BattlePanItem());
	public static final RegistryObject<Item> DIAMOND_BATTLE_PAN = REGISTRY.register("diamond_battle_pan", () -> new DiamondBattlePanItem());
	public static final RegistryObject<Item> BIG_SWORD = REGISTRY.register("big_sword", () -> new BigSwordItem());
	public static final RegistryObject<Item> VENOMSHANK = REGISTRY.register("venomshank", () -> new VenomshankItem());
	public static final RegistryObject<Item> ANGLESITE = REGISTRY.register("anglesite", () -> new AnglesiteItem());
	// Start of user code block custom items
	// End of user code block custom items
}
