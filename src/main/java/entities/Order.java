package entities;

import javax.persistence.*;

@Entity(name = "Orders")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "customer_name")
    String customerName;
    @Column(name ="created_at")
    String createdAt;
    @Column(name = "status")
    Enum status;
    @Column(name = "description")
    String description;
    @Column(name = "last_updated")
    String lastUpdated;

    public Order(){
    }

    public Order(Long id, String customerName, String createdAt, Enum status, String description, String lastUpdated){
        this.id = id;
        this.customerName = customerName;
        this.createdAt = createdAt;
        this.status = status;
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
