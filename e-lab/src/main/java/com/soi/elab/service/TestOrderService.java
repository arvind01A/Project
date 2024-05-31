package com.soi.elab.service;

import java.util.List;

import com.soi.elab.model.TestOrder;
import com.soi.elab.util.DatabaseUtil;

public class TestOrderService {
	// Mock implementation of service methods
    public List<TestOrder> getAllTestOrders() {
        // Retrieve test orders from the database
        return DatabaseUtil.getAllTestOrders();
    }

    public void placeTestOrder(TestOrder testOrder) {
        // Save test order to the database
        DatabaseUtil.saveTestOrder(testOrder);
    }
}
