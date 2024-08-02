package net.pin.dev.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pin.dev.PinDev;

public class ModItems {

    public static final Item DEVSTAFF = registerItem("dev_staff", new Item(new FabricItemSettings()));
    public static final Item STEELINGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item RAWSTEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));

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
