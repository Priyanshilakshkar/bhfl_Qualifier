package com.Java.Qualifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.Java.Qualifier.Dto.BfhlRequest;
import com.Java.Qualifier.Dto.BfhlResponse;
import com.Java.Qualifier.Service.BfhlServiceImpl;
import org.junit.jupiter.api.Test;

public class BfhlServiceTest {

    @Test
    void testProcessData() {

        BfhlServiceImpl service = new BfhlServiceImpl();

        BfhlRequest request = new BfhlRequest();

        request.setData(List.of("1", "2", "a", "&"));

        BfhlResponse response = service.processData(request);

        assertTrue(response.is_success());

        assertEquals("3", response.getSum());
    }
}
