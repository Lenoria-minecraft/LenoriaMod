package net.mcreator.modexonia.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ExoniumarmorHelmetTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency entity for procedure ExoniumarmorHelmetTickEvent!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 9999, (int) 2, (false), (false)));
	}

}
