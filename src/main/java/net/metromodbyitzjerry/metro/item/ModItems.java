package net.metromodbyitzjerry.metro.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.metromodbyitzjerry.metro.MetroMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.metromodbyitzjerry.metro.item.ModItemGroup.METRO;


public class ModItems {
    public static final Item METRO = registerItem("metro_icon", new Item(new FabricItemSettings().group(ModItemGroup.METRO)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MetroMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MetroMod.MOD_ID);
    }
}
