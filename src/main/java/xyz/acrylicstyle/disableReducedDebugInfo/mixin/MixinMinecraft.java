package xyz.acrylicstyle.disableReducedDebugInfo.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Minecraft.class, remap = false)
public class MixinMinecraft {
    @Inject(at = @At("HEAD"), method = "showOnlyReducedInfo", remap = false, cancellable = true)
    public void showOnlyReducedInfo(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
