package com.rloayza.classroom.studentlocator;

import com.rloayza.classroom.studentlocaltor.LocationChecker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocationCheckerTest {

    private LocationChecker locationChecker;

    @Before
    public void init() {
        locationChecker = new LocationChecker(10.0d, 10.0d);
    }

    @Test
    public void checkFirstQuadrantSuccess() {
        Boolean test = locationChecker.checkFirstQuadrant(15.0d, 5.0d);
        Assert.assertTrue(test);
    }

    @Test
    public void checkFirstQuadrantFail() {
        Boolean test = locationChecker.checkFirstQuadrant(15.0d, -15.0d);
        Assert.assertFalse(test);
    }

    @Test
    public void checkSecondQuadrantSuccess() {
        Boolean test = locationChecker.checkSecondQuadrant(15.0d, 15.0d);
        Assert.assertTrue(test);
    }

    @Test
    public void checkSecondQuadrantFail() {
        Boolean test = locationChecker.checkSecondQuadrant(5.0d, 2.0d);
        Assert.assertFalse(test);
    }

    @Test
    public void checkThirdQuadrantSuccess() {
        Boolean test = locationChecker.checkThirdQuadrant(5.0d, 15.0d);
        Assert.assertTrue(test);
    }

    @Test
    public void checkThirdQuadrantFail() {
        Boolean test = locationChecker.checkThirdQuadrant(15.0d, 2.0d);
        Assert.assertFalse(test);
    }

    @Test
    public void checkFourthQuadrantSuccess() {
        Boolean test = locationChecker.checkFourthQuadrant(2.0d, 5.0d);
        Assert.assertTrue(test);
    }

    @Test
    public void checkFourthQuadrantFail() {
        Boolean test = locationChecker.checkFourthQuadrant(-15.0d, 2.0d);
        Assert.assertFalse(test);
    }
}
