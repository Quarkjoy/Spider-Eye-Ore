package net.quarkjoy.spidereyeore.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quarkjoy.spidereyeore.SpiderEyeOre;

public class ModItems {

    public static final Item RAW_SPIDER_EYE = registerItem(
            "raw_spider_eye",
            new Item(new Item.Settings()),
            ItemGroups.COMBAT
    );
    public static final Item SPIDER_EYE_INGOT = registerItem(
            "spider_eye_ingot",
            new Item(new Item.Settings()),
            ItemGroups.INGREDIENTS
    );


    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(SpiderEyeOre.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpiderEyeOre.LOGGER.debug("Registering Mod Items for " + SpiderEyeOre.MOD_ID);
    }


}
