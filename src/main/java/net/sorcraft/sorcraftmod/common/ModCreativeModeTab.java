package net.sorcraft.sorcraftmod.common;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.sorcraft.sorcraftmod.common.item.ModItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab SORCRAFT_TAB = new CreativeModeTab("sorcraftmod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SPELL_STONE.get());
        }
    };
}
