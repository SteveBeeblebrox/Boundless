package io.github.sianabeeblebrox.boundless.client

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.Environment

@Environment(net.fabricmc.api.EnvType.CLIENT)
class BoundlessClient implements ClientModInitializer {
    @Override
    void onInitializeClient() {
        log.info('Boundless Client Loading')
    }
}
