package net.axay.pacmc.storage.data

import jetbrains.exodus.entitystore.Entity
import kotlinx.dnq.*

class XdMod(entity: Entity) : XdEntity(entity) {
    companion object : XdNaturalEntityType<XdMod>()

    var repository by xdRequiredStringProp()
    var id by xdRequiredIntProp()

    var name by xdRequiredStringProp(trimmed = true)
    var description by xdStringProp()

    var persistent by xdBooleanProp()
}
