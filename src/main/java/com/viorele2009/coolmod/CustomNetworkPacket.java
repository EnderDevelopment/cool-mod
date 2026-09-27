package com.viorele2009.coolmod;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.Packet;

public
class CustomNetworkPacket implements Packet<ClientGamePacketListener> {
    @Override
    public void write(FriendlyByteBuf buf) {
    }

    @Override
    public void handle(ClientGamePacketListener listener) {
    }
}
