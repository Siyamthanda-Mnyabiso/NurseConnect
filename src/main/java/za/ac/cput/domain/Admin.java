package za.ac.cput.domain;

public class Admin {
    private String adminId;
    private String adminName;
    private String adminEmail;
    private String adminRole;
    private String password;

// ============== BUILDER CONSTRUCTOR ======
    private Admin(Builder builder){
        this.adminId = builder.adminId;
        this.adminName = builder.adminName;
        this.adminEmail = builder.adminEmail;
        this.adminRole = builder.adminRole;
        this.password = builder.password;
    }
// ============== GETTERS ==================
    public String getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public String getPassword() {
        return password;
    }

// ============== FORMAT ===================

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminRole='" + adminRole + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

// ============== BUILDER CLASS ============
    public static class Builder {

    private String adminId;
    private String adminName;
    private String adminEmail;
    private String adminRole;
    private String password;

// ============== SETTERS ==================

    public Builder setAdminId(String adminId) {
        this.adminId = adminId;
        return this;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Builder setAdminRole(String adminRole) {
        this.adminRole = adminRole;
        return this;
    }

    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    public Builder setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
        return this;
    }

    public Admin build() {
        return new Admin(this);
    }
}
}
