// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Torso;
	private final ModelRenderer Right_Leg;
	private final ModelRenderer Left_Leg;
	private final ModelRenderer Right_Arm;
	private final ModelRenderer Left_Arm;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(4.0F, 0.0F, -4.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -8.0F, -8.0F, 0.0F, 8, 8, 8, 0.0F, false));

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, 24.0F, 0.0F);
		Torso.cubeList.add(new ModelBox(Torso, 16, 16, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.0F, false));

		Right_Leg = new ModelRenderer(this);
		Right_Leg.setRotationPoint(0.0F, 12.0F, 0.0F);
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 0, 16, -4.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		Left_Leg = new ModelRenderer(this);
		Left_Leg.setRotationPoint(0.0F, 12.0F, 0.0F);
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 0, 16, 0.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		Right_Arm = new ModelRenderer(this);
		Right_Arm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		setRotationAngle(Right_Arm, -1.5708F, 0.0F, 0.0F);
		Right_Arm.cubeList.add(new ModelBox(Right_Arm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		Left_Arm = new ModelRenderer(this);
		Left_Arm.setRotationPoint(4.0F, 2.0F, 0.0F);
		setRotationAngle(Left_Arm, -1.5708F, 0.0F, 0.0F);
		Left_Arm.cubeList.add(new ModelBox(Left_Arm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Torso.render(f5);
		Right_Leg.render(f5);
		Left_Leg.render(f5);
		Right_Arm.render(f5);
		Left_Arm.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Right_Arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Left_Arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}