
package model;

public class Enquiry {

    int enquiryid;
    String message;
    String status;
    String type;
    int userId;

    public Enquiry() {
    }

    public int getEnquiryid() {
        return enquiryid;
    }

    public void setEnquiryid(int enquiryid) {
        this.enquiryid = enquiryid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
