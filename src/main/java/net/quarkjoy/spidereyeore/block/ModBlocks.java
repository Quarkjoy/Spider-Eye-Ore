package net.quarkjoy.spidereyeore.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quarkjoy.spidereyeore.SpiderEyeOre;

public class ModBlocks {
    public static final Block SPIDER_EYE_BLOCK = registerBlock("spider_eye_block",
            new Block(FabricBlockSettings.of(Material.METAL).slipperiness(.989F).strength(4f).requiresTool()), ItemGroups.BUILDING_BLOCKS);

    public static final Block SPIDER_EYE_ORE = registerBlock("spider_eye_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroups.BUILDING_BLOCKS);

    public static final Block DEEPSLATE_SPIDER_EYE_ORE = registerBlock("deepslate_spider_eye_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ItemGroups.BUILDING_BLOCKS);


    //private static Block registerBlock(String name, Block block, ItemGroup tab) {
    //    return Registry.register(Registries.BLOCK, new Identifier(SpiderEyeOre.MOD_ID, name), block);
    //}

    private static Block registerBlock(String name, Block block, ItemGroup tab) {

        registerBlockItem(name, block, tab);

        return Registry.register(Registries.BLOCK, new Identifier(SpiderEyeOre.MOD_ID, name), block);

    }


    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {

        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(block));

        return Registry.register(Registries.ITEM, new Identifier(SpiderEyeOre.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }



    public static void registerModBlocks() {
        SpiderEyeOre.LOGGER.debug("Registering ModBlocks for " + SpiderEyeOre.MOD_ID);
    }
}
