package galena.oreganized.index;

import galena.oreganized.Oreganized;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.registries.DeferredRegister;

import java.util.HashSet;
import java.util.function.Supplier;

public class OPoi {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(Registries.POINT_OF_INTEREST_TYPE, Oreganized.MOD_ID);

    public static final ResourceKey<PoiType> GRAVETENDER_POI_KEY = ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE,
            Oreganized.modLoc("gravetender"));

    public static final Supplier<PoiType> GRAVETENDER_POI = POI_TYPES.register("gravetender",
            () -> new PoiType(new HashSet<>(OBlocks.SEPULCHER.get().getStateDefinition().getPossibleStates()),
                    1, 1));

}
