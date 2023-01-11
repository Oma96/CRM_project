package com.example.crm_project.dto;

import com.example.crm_project.buisness.ClientState;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ClientDTO {




        private String companyName;

        private String firstName;

        private String lastName;
        private String email;
        private String phone;
        private String address;

        private String zipCode;
        private String city;
        private String country;
        private ClientState state; // TODO: créer un Enum au lieu d'utiliser un Integer





        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public ClientState getState() {
            return state;
        }

        public void setState(ClientState state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return "Client{" + ", companyName=" + companyName + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", address=" + address + ", zipCode=" + zipCode + ", city=" + city + ", country=" + country + ", state=" + state + '}';
        }


    }


