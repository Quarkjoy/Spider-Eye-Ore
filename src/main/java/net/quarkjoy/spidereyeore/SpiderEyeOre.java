package net.quarkjoy.spidereyeore;

import net.fabricmc.api.ModInitializer;
import net.quarkjoy.spidereyeore.block.ModBlocks;
import net.quarkjoy.spidereyeore.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpiderEyeOre implements ModInitializer {
    public static final String MOD_ID = "spidereyeore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
