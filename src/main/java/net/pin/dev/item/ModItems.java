package net.pin.dev.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pin.dev.PinDev;
import net.pin.dev.item.custom.AirCompressorItem;
import net.pin.dev.item.custom.PoisonDaggerItem;
import net.pin.dev.sound.ModSounds;

public class ModItems {

    public static final Item DEVSTAFF = registerItem("dev_staff", new Item(new FabricItemSettings()));

    public static final Item INDIANMUSICDISK = registerItem("indian_music_disk", new MusicDiscItem(7, ModSounds.INDIAN_MUSIC, new FabricItemSettings().maxCount(1), 236));

    public static final Item URAN = registerItem("uran", new Item(new FabricItemSettings().food(ModFoodComponents.KILLFOOD)));

    public static final Item STEELINGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item RAWSTEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));
    public static final Item STEELCAN = registerItem("steel_can", new Item(new FabricItemSettings()));
    public static final Item STUFFEDCAN = registerItem("stuffed_can", new Item(new FabricItemSettings().food(ModFoodComponents.STUFFEDCAN).maxCount(1)));
    public static final Item DINO = registerItem("dino", new Item(new FabricItemSettings().food(ModFoodComponents.DINO)));
    public static final Item RAW_DINO = registerItem("raw_dino", new PotionItem(new FabricItemSettings().food(FoodComponents.ROTTEN_FLESH)));

    public static final Item ADRENALINESHOT = registerItem("shroom", new Item(new FabricItemSettings().food(ModFoodComponents.ADRENALINE).maxCount(8)));

    public static final Item POIDONDAGGER = registerItem("poison_dagger", new PoisonDaggerItem(new FabricItemSettings().maxCount(1).maxDamage(40)));

    public static final Item STEELPICKAXE = registerItem("steel_pickaxe", new PickaxeItem(ModToolMaterial.STEEL, 3, 1f, new FabricItemSettings()));
    public static final Item STEELSHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterial.STEEL, 4, 1.1f, new FabricItemSettings()));
    public static final Item STEELSWORD = registerItem("steel_sword", new SwordItem(ModToolMaterial.STEEL, 6, 1f, new FabricItemSettings()));
    public static final Item STEELHOE = registerItem("steel_hoe", new HoeItem(ModToolMaterial.STEEL, 2, 0.9f, new FabricItemSettings()));
    public static final Item STEELAXE = registerItem("steel_axe", new AxeItem(ModToolMaterial.STEEL, 7, 0.8f, new FabricItemSettings()));

    public static final Item COPPERPICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModToolMaterial.COPPER, 1, 0.5f, new FabricItemSettings()));
    public static final Item COPPERSHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 2, 0.5f, new FabricItemSettings()));
    public static final Item COPPERSWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER, 3, 0.4f, new FabricItemSettings()));
    public static final Item COPPERHOE = registerItem("copper_hoe", new HoeItem(ModToolMaterial.COPPER, 1, 0.6f, new FabricItemSettings()));
    public static final Item COPPERAXE = registerItem("copper_axe", new AxeItem(ModToolMaterial.COPPER, 4, 0.4f, new FabricItemSettings()));

    public static final Item AIRCOMPRESSOR = registerItem("air_compressor", new AirCompressorItem(new FabricItemSettings().maxDamage(7)));

    /*
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(STEELINGOT);
        entries.add(RAWSTEEL);
    }*/

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(PinDev.MOD_ID, name), item);
    }

    public static void registerModItems(){
        PinDev.LOGGER.info("registering mod items for" + PinDev.MOD_ID);

        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);*/
    }
}
