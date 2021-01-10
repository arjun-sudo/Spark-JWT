/**
 * @author :arjun
 * Project :Spark-JWT
 * Date : 2021-01-10
 * Time : 12:45
 */
package db.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Customer implements Serializable {
    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("firstname")
    private String firstName;

    @Expose
    @SerializedName("lastname")
    private String lastName;

    @Expose
    @SerializedName("address")
    private String address;

    @Expose
    @SerializedName("city")
    private String city;

    @Expose
    @SerializedName("country")
    private String country;

    @Expose
    @SerializedName("business_phone")
    private String businessPhone;

    @Expose
    @SerializedName("email")
    private String email;

    @Expose
    @SerializedName("zip_postalcode")
    private int zipPostalCode;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String address, String city, String country, String businessPhone, String email, int zipPostalCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.country = country;
        this.businessPhone = businessPhone;
        this.email = email;
        this.zipPostalCode = zipPostalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZipPostalCode() {
        return zipPostalCode;
    }

    public void setZipPostalCode(int zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }
}
