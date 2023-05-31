package io.github.sianabeeblebrox.boundless

import net.fabricmc.api.ModInitializer

class Boundless implements ModInitializer {
    static final String VERSION = Config.VERSION, ID = Config.ID
    @Override
    void onInitialize() {
        log.info("Boundless Loading v${VERSION}")
    }
}
