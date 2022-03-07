
package net.mcreator.modexonia.item;

@ModexoniaModElements.ModElement.Tag
public class SaphyrarmorItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:saphyrarmor_helmet")
	public static final Item helmet = null;

	@ObjectHolder("modexonia:saphyrarmor_chestplate")
	public static final Item body = null;

	@ObjectHolder("modexonia:saphyrarmor_leggings")
	public static final Item legs = null;

	@ObjectHolder("modexonia:saphyrarmor_boots")
	public static final Item boots = null;

	public SaphyrarmorItem(ModexoniaModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SaphyringotItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "saphyrarmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(SaphyrStuffItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "modexonia:textures/models/armor/aphyr_rmor_layer_1_textures_files_.png_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				ExoniumarmorHelmetTickEventProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("saphyrarmor_helmet"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(SaphyrStuffItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "modexonia:textures/models/armor/aphyr_rmor_layer_1_textures_files_.png_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}

		}.setRegistryName("saphyrarmor_chestplate"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(SaphyrStuffItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "modexonia:textures/models/armor/aphyr_rmor_layer_1_textures_files_.png_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}

		}.setRegistryName("saphyrarmor_leggings"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(SaphyrStuffItemGroup.tab)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "modexonia:textures/models/armor/aphyr_rmor_layer_1_textures_files_.png_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1")
						+ ".png";
			}

		}.setRegistryName("saphyrarmor_boots"));
	}

}
