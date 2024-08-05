package net.pin.dev.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pin.dev.PinDev;

public class ModBlocks {


    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block STEEL_ORE = registerBlock("steel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f)));

    public static final Block DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f)));

    public static final Block NETHER_STEEL_ORE = registerBlock("nether_steel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.5f)));

    public static final Block ENDSTONE_STEEL_ORE = registerBlock("endstone_steel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(2f)));

    public static final Block COPPERBOMB = registerBlock("copper_bomb",
            new CopperBombBlock(FabricBlockSettings.copyOf(Blocks.TNT)));

    public static final Block DIAMONDBOMB = registerBlock("diamond_bomb",
            new DiamondBombBlock(FabricBlockSettings.copyOf(Blocks.TNT)));

    public static final Block URANBOMB = registerBlock("uran_bomb",
            new UranBombBlock(FabricBlockSettings.copyOf(Blocks.TNT)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PinDev.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(PinDev.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlock(){
        PinDev.LOGGER.info("registering blocks for" + PinDev.MOD_ID);
    }
}
