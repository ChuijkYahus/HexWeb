package io.github.techtastic.hexweb.casting.mishap

import at.petrak.hexcasting.api.casting.eval.CastingEnvironment
import at.petrak.hexcasting.api.casting.iota.Iota
import at.petrak.hexcasting.api.casting.mishaps.Mishap
import net.minecraft.network.chat.Component
import okio.IOException

class MishapIOException(val e: IOException): Mishap() {
    override fun accentColor(ctx: CastingEnvironment, errorCtx: Context) = ctx.pigment

    override fun errorMessage(ctx: CastingEnvironment, errorCtx: Context) = Component.literal(e.localizedMessage)

    override fun execute(env: CastingEnvironment, errorCtx: Context, stack: MutableList<Iota>) {
    }
}