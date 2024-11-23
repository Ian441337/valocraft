package wuzu.ian.valocraft.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class ExposionscaleConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> SCALE;
	static {
		BUILDER.push("spike");
		SCALE = BUILDER.comment("Default: 42 | edit the scale for the explosion").define("spike_scale", (double) 42);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
