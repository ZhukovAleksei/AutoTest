package ru.netology

import calcCommissin
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcNoCommissinMaster() {
        val result = calcCommissin("Mastercard", 0.0, 1000.0)
        assertEquals(1.0, result, 0.01)
    }
    @Test
    fun calcFullCommissinMaster() {
        val result = calcCommissin("Mastercard", 75_000.0, 1000.0)
        assertEquals(26.0, result, 0.01)
    }
    @Test
    fun calcMinCommissinMaster() {
        val result = calcCommissin("Mastercard", 0.0, 200.0)
        assertEquals(21.2, result, 0.01)
    }
    @Test
    fun calcPartCommissinMaster() {
        val result = calcCommissin("Mastercard", 70_000.0, 10_000.0)
        assertEquals(50.0, result, 0.01)
    }
    @Test
    fun calcCommissinLimitDayMaster() {
        val result = calcCommissin("Mastercard", 0.0, 200_000.0)
        assertEquals(-1.0, result, 0.01)
    }
    @Test
    fun calcCommissinLimitNorthMaster() {
        val result = calcCommissin("Mastercard", 550_000.0, 100_000.0)
        assertEquals(-2.0, result, 0.01)
    }


    @Test
    fun calcNoCommissinMastro() {
        val result = calcCommissin("Maestro", 0.0, 1000.0)
        assertEquals(1.0, result, 0.01)
    }
    @Test
    fun calcFullCommissinMastro() {
        val result = calcCommissin("Maestro", 75_000.0, 1000.0)
        assertEquals(26.0, result, 0.01)
    }
    @Test
    fun calcMinCommissinMastro() {
        val result = calcCommissin("Maestro", 0.0, 200.0)
        assertEquals(21.2, result, 0.01)
    }
    @Test
    fun calcPartCommissinMastro() {
        val result = calcCommissin("Maestro", 70_000.0, 10_000.0)
        assertEquals(50.0, result, 0.01)
    }
    @Test
    fun calcCommissinLimitDayMastro() {
        val result = calcCommissin("Maestro", 0.0, 200_000.0)
        assertEquals(-1.0, result, 0.01)
    }
    @Test
    fun calcCommissinLimitNorthMastro() {
        val result = calcCommissin("Maestro", 550_000.0, 100_000.0)
        assertEquals(-2.0, result, 0.01)
    }


    @Test
    fun calcCommissinLimitNorthVisa() {
        val result = calcCommissin("Visa", 550_000.0, 100_000.0)
        assertEquals(-2.0, result, 0.01)
    }
    @Test
    fun calcCommissinLimitDayVisa() {
        val result = calcCommissin("Visa", 0.0, 200_000.0)
        assertEquals(-1.0, result, 0.01)
    }
    @Test
    fun calcFullCommissinVisa() {
        val result = calcCommissin("Visa", 0.0, 100_000.0)
        assertEquals(750.0, result, 0.01)
    }
    @Test
    fun calcMinCommissinVisa() {
        val result = calcCommissin("Visa", 0.0, 1_000.0)
        assertEquals(35.0, result, 0.01)
    }

    @Test
    fun calcCommissinLimitNorthMir() {
        val result = calcCommissin("Мир", 550_000.0, 100_000.0)
        assertEquals(-2.0, result, 0.01)
    }
    @Test
    fun calcCommissinLimitDayMir() {
        val result = calcCommissin("Мир", 0.0, 200_000.0)
        assertEquals(-1.0, result, 0.01)
    }
    @Test
    fun calcFullCommissinMir() {
        val result = calcCommissin("Мир", 0.0, 100_000.0)
        assertEquals(750.0, result, 0.01)
    }
    @Test
    fun calcMinCommissinMir() {
        val result = calcCommissin("Мир", 0.0, 1_000.0)
        assertEquals(35.0, result, 0.01)
    }


    @Test
    fun calcCommissinLimitNorthVK() {
        val result = calcCommissin("VK", 0.0, 50_000.0)
        assertEquals(-2.0, result, 0.01)
    }
    @Test
    fun calcCommissinLimitDayhVK() {
        val result = calcCommissin("VK", 0.0, 20_000.0)
        assertEquals(-1.0, result, 0.01)
    }
    @Test
    fun calcNoCommissinVK() {
        val result = calcCommissin("VK", 0.0, 10_000.0)
        assertEquals(1.0, result, 0.01)
    }
}
