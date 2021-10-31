import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestListCity {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest() {
        City cityToAdd = new City("Halifax", "NS");
        list.addCity(cityToAdd);
        assertTrue(list.hasCity(cityToAdd));
    }

    @Test
    public void deleteCityTest() {
        list.addCity(new City("Halifax", "NS"));
        list.deleteCity(list.getCity(0));
        assertEquals(list.getCount(), 0);
    }

    @Test
    public void getCountTest() {
        list.addCity(new City("Halifax", "NS"));
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Nairobi", "KE"));
        list.addCity(new City("Mombasa", "KE"));
        assertEquals(list.countCities(), 4);
    }
}
