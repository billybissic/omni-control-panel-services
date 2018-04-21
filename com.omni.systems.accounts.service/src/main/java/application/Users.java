package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer uuid; 
	private Integer user_profile_id; 
	private  String user_name; 
	private  String user_password; 
	private  String last_password_changed_date; 
	private Integer password_change_requested; 
	private Integer password_reset_requested; 
	private  String user_email; 
	private  String user_touched; 
	private  String user_token; 
	private Integer user_email_authenticated; 
	private  String user_email_token; 
	private  String user_email_token_expires; 
	private Integer user_edit_count; 
	private Integer user_language_code; 
	private  String user_signature; 
	private  String user_create_timestamp; 
	private Integer user_login_count; 
	private Integer user_timezone_code; 
	private Integer user_preferred_admin_language_code; 
	private  String user_init;
	
	/**
	 * @return the uuid
	 */
	public Integer getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	/**
	 * @return the user_profile_id
	 */
	public Integer getUser_profile_id() {
		return user_profile_id;
	}
	/**
	 * @param user_profile_id the user_profile_id to set
	 */
	public void setUser_profile_id(Integer user_profile_id) {
		this.user_profile_id = user_profile_id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	/**
	 * @return the last_password_changed_date
	 */
	public String getLast_password_changed_date() {
		return last_password_changed_date;
	}
	/**
	 * @param last_password_changed_date the last_password_changed_date to set
	 */
	public void setLast_password_changed_date(String last_password_changed_date) {
		this.last_password_changed_date = last_password_changed_date;
	}
	/**
	 * @return the password_change_requested
	 */
	public Integer getPassword_change_requested() {
		return password_change_requested;
	}
	/**
	 * @param password_change_requested the password_change_requested to set
	 */
	public void setPassword_change_requested(Integer password_change_requested) {
		this.password_change_requested = password_change_requested;
	}
	/**
	 * @return the password_reset_requested
	 */
	public Integer getPassword_reset_requested() {
		return password_reset_requested;
	}
	/**
	 * @param password_reset_requested the password_reset_requested to set
	 */
	public void setPassword_reset_requested(Integer password_reset_requested) {
		this.password_reset_requested = password_reset_requested;
	}
	/**
	 * @return the user_email
	 */
	public String getUser_email() {
		return user_email;
	}
	/**
	 * @param user_email the user_email to set
	 */
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	/**
	 * @return the user_touched
	 */
	public String getUser_touched() {
		return user_touched;
	}
	/**
	 * @param user_touched the user_touched to set
	 */
	public void setUser_touched(String user_touched) {
		this.user_touched = user_touched;
	}
	/**
	 * @return the user_token
	 */
	public String getUser_token() {
		return user_token;
	}
	/**
	 * @param user_token the user_token to set
	 */
	public void setUser_token(String user_token) {
		this.user_token = user_token;
	}
	/**
	 * @return the user_email_authenticated
	 */
	public Integer getUser_email_authenticated() {
		return user_email_authenticated;
	}
	/**
	 * @param user_email_authenticated the user_email_authenticated to set
	 */
	public void setUser_email_authenticated(Integer user_email_authenticated) {
		this.user_email_authenticated = user_email_authenticated;
	}
	/**
	 * @return the user_email_token
	 */
	public String getUser_email_token() {
		return user_email_token;
	}
	/**
	 * @param user_email_token the user_email_token to set
	 */
	public void setUser_email_token(String user_email_token) {
		this.user_email_token = user_email_token;
	}
	/**
	 * @return the user_email_token_expires
	 */
	public String getUser_email_token_expires() {
		return user_email_token_expires;
	}
	/**
	 * @param user_email_token_expires the user_email_token_expires to set
	 */
	public void setUser_email_token_expires(String user_email_token_expires) {
		this.user_email_token_expires = user_email_token_expires;
	}
	/**
	 * @return the user_edit_count
	 */
	public Integer getUser_edit_count() {
		return user_edit_count;
	}
	/**
	 * @param user_edit_count the user_edit_count to set
	 */
	public void setUser_edit_count(Integer user_edit_count) {
		this.user_edit_count = user_edit_count;
	}
	/**
	 * @return the user_language_code
	 */
	public Integer getUser_language_code() {
		return user_language_code;
	}
	/**
	 * @param user_language_code the user_language_code to set
	 */
	public void setUser_language_code(Integer user_language_code) {
		this.user_language_code = user_language_code;
	}
	/**
	 * @return the user_signature
	 */
	public String getUser_signature() {
		return user_signature;
	}
	/**
	 * @param user_signature the user_signature to set
	 */
	public void setUser_signature(String user_signature) {
		this.user_signature = user_signature;
	}
	/**
	 * @return the user_create_timestamp
	 */
	public String getUser_create_timestamp() {
		return user_create_timestamp;
	}
	/**
	 * @param user_create_timestamp the user_create_timestamp to set
	 */
	public void setUser_create_timestamp(String user_create_timestamp) {
		this.user_create_timestamp = user_create_timestamp;
	}
	/**
	 * @return the user_login_count
	 */
	public Integer getUser_login_count() {
		return user_login_count;
	}
	/**
	 * @param user_login_count the user_login_count to set
	 */
	public void setUser_login_count(Integer user_login_count) {
		this.user_login_count = user_login_count;
	}
	/**
	 * @return the user_timezone_code
	 */
	public Integer getUser_timezone_code() {
		return user_timezone_code;
	}
	/**
	 * @param user_timezone_code the user_timezone_code to set
	 */
	public void setUser_timezone_code(Integer user_timezone_code) {
		this.user_timezone_code = user_timezone_code;
	}
	/**
	 * @return the user_preferred_admin_language_code
	 */
	public Integer getUser_preferred_admin_language_code() {
		return user_preferred_admin_language_code;
	}
	/**
	 * @param user_preferred_admin_language_code the user_preferred_admin_language_code to set
	 */
	public void setUser_preferred_admin_language_code(Integer user_preferred_admin_language_code) {
		this.user_preferred_admin_language_code = user_preferred_admin_language_code;
	}
	/**
	 * @return the user_init
	 */
	public String getUser_init() {
		return user_init;
	}
	/**
	 * @param user_init the user_init to set
	 */
	public void setUser_init(String user_init) {
		this.user_init = user_init;
	}
}
