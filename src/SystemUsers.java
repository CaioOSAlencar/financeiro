import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class SystemUsers{
    private int id;
    private String name;
    private String email;
    private String site;
    private String login;
    private String password;
    private SystemUnit System_unit_id;
    private int frontpage_id;
    private String Photo_path;
    private boolean active;
    private boolean accepted_term_policy;
    private String accepted_term_policy_at;
    private LocalDateTime accepted_term_policy_data;
    private String phone;
    private String address;
    private String about;
    private String function_name;
    private String custom_code;
    private String otp_secret;



    public SystemUsers(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SystemUnit getSystem_unit_id() {
        return System_unit_id;
    }

    public void setSystem_unit_id(SystemUnit System_unit_id) {
        this.System_unit_id = System_unit_id;
    }

    public int getFrontpage_id() {
        return frontpage_id;
    }

    public void setFrontpage_id(int frontpage_id) {
        this.frontpage_id = frontpage_id;
    }

    public String getPhoto_path() {
        return Photo_path;
    }

    public void setPhoto_path(String Photo_path) {
        this.Photo_path = Photo_path;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAccepted_term_policy() {
        return accepted_term_policy;
    }

    public void setAccepted_term_policy(boolean accepted_term_policy) {
        this.accepted_term_policy = accepted_term_policy;
    }

    public String getAccepted_term_policy_at() {
        return accepted_term_policy_at;
    }

    public void setAccepted_term_policy_at(String accepted_term_policy_at) {
        this.accepted_term_policy_at = accepted_term_policy_at;
    }

    public LocalDateTime getAccepted_term_policy_data() {
        return accepted_term_policy_data;
    }

    public void setAccepted_term_policy_data(LocalDateTime accepted_term_policy_data) {
        this.accepted_term_policy_data = accepted_term_policy_data;
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public String getCustom_code() {
        return custom_code;
    }

    public void setCustom_code(String custom_code) {
        this.custom_code = custom_code;
    }

    public String getOtp_secret() {
        return otp_secret;
    }

    public void setOtp_secret(String otp_secret) {
        this.otp_secret = otp_secret;
    }
}