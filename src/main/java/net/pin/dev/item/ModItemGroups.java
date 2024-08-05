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

                        entries.add(ModBlocks.STEEL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_STEEL_ORE);
                        entries.add(ModBlocks.NETHER_STEEL_ORE);
                        entries.add(ModBlocks.ENDSTONE_STEEL_ORE);

                        entries.add(ModItems.STEELCAN);
                        entries.add(ModItems.STUFFEDCAN);

                        entries.add(ModItems.STEELHOE);
                        entries.add(ModItems.STEELPICKAXE);
                        entries.add(ModItems.STEELAXE);
                        entries.add(ModItems.STEELSWORD);
                        entries.add(ModItems.STEELSHOVEL);

                        entries.add(ModItems.DINO);
                        entries.add(ModItems.RAW_DINO);

                        entries.add(ModItems.COPPERHOE);
                        entries.add(ModItems.COPPERPICKAXE);
                        entries.add(ModItems.COPPERAXE);
                        entries.add(ModItems.COPPERSWORD);
                        entries.add(ModItems.COPPERSHOVEL);

                        entries.add(ModItems.AIRCOMPRESSOR);

                        entries.add(ModBlocks.COPPERBOMB);
                        entries.add(ModBlocks.DIAMONDBOMB);
                        entries.add(ModBlocks.URANBOMB);

                        entries.add(ModBlocks.URANINITEORE);

                        entries.add(ModItems.URAN);

                        //entries.add(ModItems.INDIANMUSICDISK);


                    }).build());

    public static void registerItemGroups(){
        PinDev.LOGGER.info("registering mod item grupz for" + PinDev.MOD_ID);

    }
}
