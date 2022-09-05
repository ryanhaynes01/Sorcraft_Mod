package net.sorcraft.sorcraftmod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SorcraftMod.MOD_ID)
public class SorcraftMod {
    public static final String MOD_ID = "sorcraftmod";

    private static final Logger LOGGER = LogManager.getLogger();

    public SorcraftMod() {
        IEventBus event_bus = FMLJavaModLoadingContext.get().getModEventBus();

        event_bus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hello from PreInit for Sorcraft!");
    }

}
