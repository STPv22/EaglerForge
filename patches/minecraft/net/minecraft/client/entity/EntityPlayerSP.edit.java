
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 6  @  2

+ import net.lax1dude.eaglercraft.v1_8.sp.SingleplayerServerController;
+ import net.lax1dude.eaglercraft.v1_8.sp.lan.LANClientNetworkManager;
+ import net.lax1dude.eaglercraft.v1_8.sp.lan.LANServerController;
+ import net.lax1dude.eaglercraft.v1_8.sp.socket.ClientIntegratedServerNetworkManager;

> DELETE  3  @  3 : 4

> DELETE  51  @  51 : 52

> INSERT  22 : 23  @  22

+ 	private StatFileWriter statWriter;

> CHANGE  1 : 2  @  1 : 2

~ 	public EntityPlayerSP(Minecraft mcIn, World worldIn, NetHandlerPlayClient netHandler, StatFileWriter statWriter) {

> DELETE  2  @  2 : 3

> INSERT  2 : 3  @  2

+ 		this.statWriter = statWriter;

> INSERT  19 : 20  @  19

+ 			mc.modapi.onUpdate();

> CHANGE  97 : 104  @  97 : 98

~ 		if (((sendQueue.getNetworkManager() instanceof ClientIntegratedServerNetworkManager)
~ 				|| (sendQueue.getNetworkManager() instanceof LANClientNetworkManager))
~ 				&& message.startsWith("/eagskull")) {
~ 			this.mc.eagskullCommand.openFileChooser();
~ 		} else {
~ 			this.sendQueue.addToSendQueue(new C01PacketChatMessage(message));
~ 		}

> EOF
