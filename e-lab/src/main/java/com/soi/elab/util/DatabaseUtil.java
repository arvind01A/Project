package com.soi.elab.util;

import java.util.ArrayList;
import java.util.List;

import com.soi.elab.model.TestOrder;

public class DatabaseUtil {
	 // Mock implementation for demonstration purposes
    private static List<TestOrder> testOrders = new ArrayList<>();

    public static List<TestOrder> getAllTestOrders() {
        // Retrieve all test orders from the database
        return testOrders;
    }

    public static void saveTestOrder(TestOrder testOrder) {
        // Save test order to the database
        testOrders.add(testOrder);
    }
}
