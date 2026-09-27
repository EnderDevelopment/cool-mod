package com.viorele2009.coolmod;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public
class CustomCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("coolcommand").executes(CustomCommand::execute));
    }

    private static int execute(CommandContext<CommandSourceStack> context) {
        context.getSource().sendSuccess(Component.literal("Cool command executed!"), false);
        return 1;
    }
}
