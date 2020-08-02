package com.zinthite.zinthtools.events;

import com.zinthite.zinthtools.ZT;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ZT.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ZTEvents {
    @SubscribeEvent
    public static void onFallToVoid(LivingDamageEvent event) {
        if(event.getSource() == dama)
    }
}
