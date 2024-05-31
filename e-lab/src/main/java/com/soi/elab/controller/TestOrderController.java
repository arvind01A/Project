package com.soi.elab.controller;

import java.util.List;

import com.soi.elab.model.TestOrder;
import com.soi.elab.service.TestOrderService;

public class TestOrderController {
	private TestOrderService testOrderService = new TestOrderService();
    private TestOrder newTestOrder = new TestOrder();
    private List<TestOrder> testOrders;

    // Getter and setter for newTestOrder

    public List<TestOrder> getTestOrders() {
        testOrders = testOrderService.getAllTestOrders();
        return testOrders;
    }

    public void placeTestOrder() {
        testOrderService.placeTestOrder(newTestOrder);
        newTestOrder = new TestOrder(); // Clear the form after submission
    }
}
