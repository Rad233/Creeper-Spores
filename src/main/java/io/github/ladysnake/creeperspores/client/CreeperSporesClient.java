/*
 * Creeper-Spores
 * Copyright (C) 2019 Ladysnake
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; If not, see <https://www.gnu.org/licenses>.
 */
package io.github.ladysnake.creeperspores.client;

import io.github.ladysnake.creeperspores.CreeperSpores;
import io.github.ladysnake.creeperspores.common.CreeperlingEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;

public class CreeperSporesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(CreeperlingEntity.class, (r, it) -> new CreeperlingEntityRenderer(r));
        ClientSidePacketRegistry.INSTANCE.register(CreeperSpores.CREEPERLING_FERTILIZATION, CreeperlingEntity::createParticles);
    }
}
