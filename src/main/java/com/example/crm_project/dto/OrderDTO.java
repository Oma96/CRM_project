package com.example.crm_project.dto;

import com.example.crm_project.buisness.OrderState;
import com.example.crm_project.dao.Client;
import jakarta.persistence.*;

public class OrderDTO {
        private String typePresta;
        private String designation;

        private Integer nbDays;

        private Integer unitPrice;
        private OrderState state;
        private ClientDTO client;


        public String getTypePresta() {
            return typePresta;
        }

        public void setTypePresta(String typePresta) {
            this.typePresta = typePresta;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public Integer getNbDays() {
            return nbDays;
        }

        public void setNbDays(Integer nbDays) {
            this.nbDays = nbDays;
        }

        public Integer getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(Integer unitPrice) {
            this.unitPrice = unitPrice;
        }

        public OrderState getState() {
            return state;
        }

        public void setState(OrderState state) {
            this.state = state;
        }

        public ClientDTO getClient() {
            return client;
        }

        public void setClient(ClientDTO client) {
            this.client = client;
        }

        @Override
        public String toString() {
            return "Order{" + "id=" + ", typePresta=" + typePresta + ", designation=" + designation + ", nbDays=" + nbDays + ", unitPrice=" + unitPrice + ", state=" + state + '}';
        }
    }

