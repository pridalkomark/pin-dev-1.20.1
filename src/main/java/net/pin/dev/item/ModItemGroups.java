package net.pin.dev.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pin.dev.PinDev;
import net.pin.dev.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup PINDEV_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(PinDev.MOD_ID, "pindev_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pindev_items"))
                    .icon(() -> new ItemStack(ModItems.STEELINGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAWSTEEL);
                        entries.add(ModItems.STEELINGOT);

                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.RAW_STEEL_BLOCK);


                    }).build());

    public static void registerItemGroups(){
        PinDev.LOGGER.info("registering mod item grupz for" + PinDev.MOD_ID);

    }
}
