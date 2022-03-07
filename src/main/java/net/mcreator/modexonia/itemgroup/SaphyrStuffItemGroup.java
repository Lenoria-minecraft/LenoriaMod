
package net.mcreator.modexonia.itemgroup;

@ModexoniaModElements.ModElement.Tag
public class SaphyrStuffItemGroup extends ModexoniaModElements.ModElement {

	public SaphyrStuffItemGroup(ModexoniaModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsaphyr_stuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SaphyringotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
