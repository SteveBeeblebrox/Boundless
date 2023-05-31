package io.github.sianabeeblebrox.boundless.util

import io.github.sianabeeblebrox.boundless.Boundless
import net.minecraft.util.Identifier
import org.jetbrains.annotations.Nullable

class BoundlessIdentifier extends Identifier {
    protected BoundlessIdentifier(String path, @Nullable ExtraData extraData) {
        super(Boundless.ID, path, extraData)
    }

    BoundlessIdentifier(String path) {
        super(Boundless.ID, path)
    }
}
