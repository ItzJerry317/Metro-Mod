package net.metromodbyitzjerry.metro.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.metromodbyitzjerry.metro.MetroMod;
import net.metromodbyitzjerry.metro.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block SAFETYDOOR = registerBlock("safety_door", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(MetroMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(MetroMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ModItemGroup.METRO)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + MetroMod.MOD_ID);
    }
}
