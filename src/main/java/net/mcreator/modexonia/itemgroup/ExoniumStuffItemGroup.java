
package net.mcreator.modexonia.itemgroup;

@ModexoniaModElements.ModElement.Tag
public class ExoniumStuffItemGroup extends ModexoniaModElements.ModElement {

	public ExoniumStuffItemGroup(ModexoniaModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabexonium_stuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ExoniumingotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;

}
