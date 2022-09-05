package net.sorcraft.sorcraftmod.common.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sorcraft.sorcraftmod.SorcraftMod;
import net.sorcraft.sorcraftmod.common.ModCreativeModeTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SorcraftMod.MOD_ID);

    public static final RegistryObject<Item> SPELL_STONE = ITEMS.register("spell_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SORCRAFT_TAB)));

    public static void register(IEventBus event_bus) {
        ITEMS.register(event_bus);
    }
}
