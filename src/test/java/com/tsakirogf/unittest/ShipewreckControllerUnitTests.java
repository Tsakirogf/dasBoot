package com.tsakirogf.unittest;

import com.tsakirogf.controller.ShipwreckController;
import com.tsakirogf.model.Shipwreck;
import com.tsakirogf.services.HomeService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.validation.constraints.Null;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(ShipwreckController.class)
public class ShipewreckControllerUnitTests
{
    @InjectMocks
    private ShipwreckController controller;

    @MockBean
    private HomeService mockService;

    @Before
    public void init()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetShipwreck()
    {
        Shipwreck sw = new Shipwreck();
        Optional<Shipwreck> ite =
        Assertions.assertThat(sw).isNotNull();
        sw.setId(1);
        when(mockService.findById(1)).thenReturn(ite);
    }
}
