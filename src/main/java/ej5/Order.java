package ej5;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String number;
    private Date ordered;
    private Date shipped;
    private String ship_to;
    private BigDecimal total;
    private enum OrderStatus{
        NEW, HOLD, SHIPPED, DELIVERED, CLOSED;
    }
}
