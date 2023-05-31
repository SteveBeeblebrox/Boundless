package io.github.sianabeeblebrox.boundless.util

import net.minecraft.registry.Registries

trait Registry<T> {
    def register(String path, T value) {
        net.minecraft.registry.Registry.register(Registries.ACTIVITY, new BoundlessIdentifier(path), value);
    }
}
