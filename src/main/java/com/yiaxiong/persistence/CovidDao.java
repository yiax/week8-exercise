package com.yiaxiong.persistence;

import com.covid.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CovidDao {
    private final Logger logger = LogManager.getLogger(this.getClass());

    State getState(String st) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://covidtracking.com/api/states?state=" + st);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        State state = null;
        try {
            state = mapper.readValue(response, State.class);
        } catch (JsonParseException jsonParseException) {
            logger.error("There was an error parsing the JSON.", jsonParseException);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("There was and error processing the JSON", jsonProcessingException);
        }
        return state;
    }

    StateDailyCount getStateDailyCount(String st, String date) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://covidtracking.com/api/states/daily?state=" + st + "&date=" + date);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        StateDailyCount stateDailyCount = null;
        try {
            stateDailyCount = mapper.readValue(response, StateDailyCount.class);
        } catch (JsonParseException jsonParseException) {
            logger.error("There was an error parsing the JSON.", jsonParseException);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("There was and error processing the JSON", jsonProcessingException);
        }
        return stateDailyCount;
    }

    USDailyCount getUSDailyCount(String date) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://covidtracking.com/api/us/daily?date=" + date);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        USDailyCount usDailyCount = null;
        try {
            usDailyCount = mapper.readValue(response, USDailyCount.class);
        } catch (JsonParseException jsonParseException) {
            logger.error("There was an error parsing the JSON.", jsonParseException);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("There was and error processing the JSON", jsonProcessingException);
        }
        return usDailyCount;
    }

    StateInfo getStateInfo(String state) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://covidtracking.com/api/states/info?state=" + state);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        StateInfo stateInfo = null;
        try {
            stateInfo = mapper.readValue(response, StateInfo.class);
        } catch (JsonParseException jsonParseException) {
            logger.error("There was an error parsing the JSON.", jsonParseException);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("There was and error processing the JSON", jsonProcessingException);
        }
        return stateInfo;
    }

    County getCounty(String state, String co) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://covidtracking.com/api/counties?state=" + state + "&county=" + co + "");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        County county = null;
        try {
            county = mapper.readValue(response, County.class);
        } catch (JsonParseException jsonParseException) {
            logger.error("There was an error parsing the JSON.", jsonParseException);
        } catch (JsonProcessingException jsonProcessingException) {
            logger.error("There was and error processing the JSON", jsonProcessingException);
        }
        return county;
    }
}
