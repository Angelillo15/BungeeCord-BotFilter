package net.md_5.bungee.protocol.packet.extra;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.md_5.bungee.protocol.AbstractPacketHandler;
import net.md_5.bungee.protocol.DefinedPacket;
import net.md_5.bungee.protocol.ProtocolConstants;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class EntityEffect
extends DefinedPacket {
    
    private int entId;
    private byte effId;
    private byte lvl;
    private int duration;
    private byte fa;
    @Override
    public void write(ByteBuf buf, ProtocolConstants.Direction direction, int protocolVersion) {
        writeVarInt( -1, buf );
        buf.writeByte(16);
        buf.writeByte( 2 );
        writeVarInt( 30*20, buf );
        buf.writeByte(0x01);
    }

    @Override
    public void handle(AbstractPacketHandler handler) throws Exception {
        throw new UnsupportedOperationException();
    }

}