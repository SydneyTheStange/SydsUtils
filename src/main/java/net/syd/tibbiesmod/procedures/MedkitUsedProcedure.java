package net.syd.tibbiesmod.procedures;

import net.syd.tibbiesmod.item.MedkitItem;
import net.syd.tibbiesmod.SydsutilsModElements;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@SydsutilsModElements.ModElement.Tag
public class MedkitUsedProcedure extends SydsutilsModElements.ModElement {
	public MedkitUsedProcedure(SydsutilsModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MedkitUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 20);
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(MedkitItem.block, (int) (1));
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
		}
	}
}
