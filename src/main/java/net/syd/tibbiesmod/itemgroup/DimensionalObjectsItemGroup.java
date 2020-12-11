
package net.syd.tibbiesmod.itemgroup;

import net.syd.tibbiesmod.item.DimensionSwitcherItem;
import net.syd.tibbiesmod.SydsutilsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SydsutilsModElements.ModElement.Tag
public class DimensionalObjectsItemGroup extends SydsutilsModElements.ModElement {
	public DimensionalObjectsItemGroup(SydsutilsModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdimensional_objects") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DimensionSwitcherItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
