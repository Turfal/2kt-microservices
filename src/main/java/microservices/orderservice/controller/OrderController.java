package microservices.orderservice.controller;

import microservices.orderservice.model.Order;
import microservices.orderservice.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final Map<Integer, Order> orders = new HashMap<>();
    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        User user = restTemplate.getForObject("http://localhost:8081/users/" + order.getUserId(), User.class);
        if (user != null) {
            orders.put(order.getId(), order);
            return order;
        } else {
            throw new RuntimeException("User not found");
        }
    }

    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable int orderId) {
        Order order = orders.get(orderId);
        if (order != null) {
            User user = restTemplate.getForObject("http://localhost:8081/users/" + order.getUserId(), User.class);
            if (user != null) {
                return order;
            } else {
                throw new RuntimeException("User not found");
            }
        } else {
            throw new RuntimeException("Order not found");
        }
    }
}
