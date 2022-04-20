package com.renjunxi.mod.bettercopper;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Bettercopper implements ModInitializer {
    public static ToolItem COPPER_SWORD = new SwordItem(org.renjunxi.mod.bettercopper.CopperMaterial.INSTANCE, 1, 3, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem COPPER_AXE = new org.renjunxi.mod.bettercopper.CopperAxe(org.renjunxi.mod.bettercopper.CopperMaterial.INSTANCE, 4, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem COPPER_PICKAXE = new org.renjunxi.mod.bettercopper.CopperPickAxe(org.renjunxi.mod.bettercopper.CopperMaterial.INSTANCE, -4, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier("better_copper", "better_copper.copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier("better_copper", "better_copper.copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("better_copper", "better_copper.copper_pickaxe"), COPPER_PICKAXE);
    }
}
