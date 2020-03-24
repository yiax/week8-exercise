package com.yiaxiong.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CovidDaoTest {

    @Test
    void getStateSuccess() {
        CovidDao dao = new CovidDao();
        assertEquals("WI", dao.getState("WI").getState());
    }

    @Test
    void getStateDailyCountSuccess() {
        CovidDao dao = new CovidDao();
        assertEquals("WI", dao.getStateDailyCount("WI", "20200322").getState());
        assertEquals(20200322, dao.getStateDailyCount("WI", "20200322").getDate());
        assertEquals(6615, dao.getStateDailyCount("WI", "20200322").getTotal());
    }

    @Test
    void getUSDailyCountSuccess() {
        CovidDao dao = new CovidDao();
        assertEquals(20200322, dao.getUSDailyCount("20200322").getDate());
        assertEquals(228216, dao.getUSDailyCount("20200322").getTotal());
        assertEquals(2554, dao.getUSDailyCount("20200322").getHospitalized());
        assertEquals(398, dao.getUSDailyCount("20200322").getDeath());
    }

    @Test
    void getStateInfoSuccess() {
        CovidDao dao = new CovidDao();
        assertEquals("WI", dao.getStateInfo("WI").getState());
        assertEquals("Wisconsin", dao.getStateInfo("WI").getName());
        assertEquals("https://www.dhs.wisconsin.gov/outbreaks/index.htm", dao.getStateInfo("WI").getCovid19Site());
        assertEquals("@DHSWI", dao.getStateInfo("WI").getTwitter());
        assertEquals("No pending counts. Positive = “Positive” + “Positive Recovered”  ", dao.getStateInfo("WI").getNotes());
    }

    @Test
    void getCountySuccess() {
        CovidDao dao = new CovidDao();
        assertEquals("NY", dao.getCounty("NY", "Westchester").getState());
        assertEquals("Westchester", dao.getCounty("NY", "Westchester").getCounty());
        assertEquals("https://health.westchestergov.com/2019-novel-coronavirus", dao.getCounty("NY", "Westchester").getCovid19Site());
    }
}