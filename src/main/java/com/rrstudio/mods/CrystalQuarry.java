package com.rrstudio.mods;

import com.rrstudio.mods.setup.Registration;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CrystalQuarry.MODID)
public class CrystalQuarry {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "crystalquarry";

    public CrystalQuarry() {
        Registration.init();
    }
}
