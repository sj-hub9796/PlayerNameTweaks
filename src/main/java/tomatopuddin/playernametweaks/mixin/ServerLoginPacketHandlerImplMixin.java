package tomatopuddin.playernametweaks.mixin;

import net.minecraft.util.StringUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(StringUtil.class)
public class ServerLoginPacketHandlerImplMixin {
    /**
     * @author
     * @reason
     */
    @Overwrite
    public static boolean isValidPlayerName(String string) {
        return true;
    }
}
