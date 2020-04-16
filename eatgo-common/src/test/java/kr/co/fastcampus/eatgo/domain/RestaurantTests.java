package kr.co.fastcampus.eatgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RestaurantTests {
    @Test
    public void creation() {
        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("bob zip")
                .address("Seoul")
                .build();
        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void information() {
        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("bob zip")
                .address("Seoul")
                .build();

        assertThat(restaurant.getInformation(), is("bob zip in Seoul"));
    }
}