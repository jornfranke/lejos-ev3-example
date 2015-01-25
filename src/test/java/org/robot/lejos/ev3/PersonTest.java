package org.robot.lejos.ev3;

import org.junit.Test;

import org.robot.lejos.ev3.Person;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
