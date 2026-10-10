package com.example.hw03.task5

abstract class SmartDevice(val name: String) {

    abstract fun turnOn()
    fun showName() {
        println(name)
    }
}

interface Connectable {
    fun connect()
}

interface Rechargeable {
    fun charge()
}

class SmartWatch(name: String) : SmartDevice(name), Connectable, Rechargeable {

    override fun turnOn() {
        println("$name is ON")
    }

    override fun connect() {
        println("$name connected to phone")
    }

    private var battery: Int = 50
        private set(value) {
            field = value.coerceIn(0,100)
        }

    override fun charge() {
        battery += 20
        println("Battery: $battery%")
    }

    var ownerName: String? = null
    fun showOwner() {
        println("Owner: ${ownerName ?: "Not set"}")
    }
}

fun main() {
    val device = SmartWatch("Galaxy Watch")
    device.showName()
    device.turnOn()
    device.connect()
    for (i in 1..3) {
        device.charge()
    }
    device.showOwner()
    device.ownerName = "Rani"
    device.showOwner()
}

